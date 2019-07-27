package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import static pl.sda.CookieUtil.getCookie;

@WebServlet("/home")
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookieLogin = getCookie("login", req);
        if(cookieLogin == null || isBlank(cookieLogin.getValue())){
            req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req, resp);
        }else {
            req.setAttribute("login", cookieLogin.getValue());
            req.getRequestDispatcher("/WEB-INF/view/hello-user.jsp").forward(req, resp);
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.isEmpty();
    }
}
