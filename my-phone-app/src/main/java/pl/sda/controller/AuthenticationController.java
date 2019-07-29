package pl.sda.controller;

import pl.sda.service.AuthenticationService;
import pl.sda.service.AuthenticationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/uwierzytelnianie")
public class AuthenticationController extends HttpServlet {

    private AuthenticationService authenticationService = new AuthenticationServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean authenticated = authenticationService.authenticate(req);
        if(authenticated){
            String login = req.getParameter("login");
            req.getSession().setAttribute("login", login);
            resp.sendRedirect("/koszyk");
        }else {
            req.setAttribute("invalidCredentials", true);
            req.getRequestDispatcher("/login").forward(req, resp);
        }
    }
}
