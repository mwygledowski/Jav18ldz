package pl.sda.service;


import pl.sda.model.User;

import javax.servlet.http.HttpServletRequest;

public class AuthenticationServiceImpl implements AuthenticationService {

    private UserService userService = new UserServiceImpl();

    @Override
    public boolean authenticate(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = userService.getUser(login);
        if (user != null && user.getPassword().equals(password)) {
            request.getSession().setAttribute("isAuthenticated", true);
            return true;
        }
        request.getSession().setAttribute("isAuthenticated", false);
        return false;
    }

    @Override
    public boolean isAuthenticated(HttpServletRequest request) {
        if(request.getSession().getAttribute("isAuthenticated") != null){
            return (boolean) request.getSession().getAttribute("isAuthenticated");
        }
        return false;
    }
}
