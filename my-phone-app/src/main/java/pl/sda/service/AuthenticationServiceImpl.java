package pl.sda.service;


import pl.sda.model.User;

import javax.servlet.http.HttpServletRequest;

public class AuthenticationServiceImpl implements AuthenticationService {

    private UserService userService = new UserServiceImpl();

    private final static String IS_AUTHENTICATED = "isAuthenticated";

    @Override
    public boolean authenticate(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = userService.getUser(login);
        if (user != null && user.getPassword().equals(password)) {
            request.getSession().setAttribute(IS_AUTHENTICATED, true);
            return true;
        }
        request.getSession().setAttribute(IS_AUTHENTICATED, false);
        return false;
    }

    @Override
    public boolean isAuthenticated(HttpServletRequest request) {
        if(request.getSession().getAttribute(IS_AUTHENTICATED) != null){
            return (boolean) request.getSession().getAttribute(IS_AUTHENTICATED);
        }
        return false;
    }

    @Override
    public void logout(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().setAttribute(IS_AUTHENTICATED, false);
    }
}
