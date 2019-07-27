package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addCookie")
public class AddCookieController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String login = req.getParameter("login");
        Cookie cookieLogin = new Cookie("login", login);
        cookieLogin.setMaxAge(minutesToSeconds(2));
        resp.addCookie(cookieLogin);
        resp.sendRedirect(req.getContextPath() + "/home");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println();
    }

    private int minutesToSeconds(int minutes) {
        return minutes * 60;
    }
}
