package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static pl.sda.CookieUtil.getCookie;

@WebServlet("/delete-cookie")
public class DeleteCookieController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Cookie loginCookie = getCookie("login", req);
        loginCookie.setMaxAge(0);
        resp.addCookie(loginCookie);
        resp.sendRedirect(req.getContextPath() + "/home");
    }
}
