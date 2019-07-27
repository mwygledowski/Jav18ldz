package pl.sda.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/jstl-core-demo")
public class JstlCoreDemoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name1", "Roman");
        req.setAttribute("countries", Arrays.asList("Poland", "UK", "USA"));

        req.getRequestDispatcher("/jstl-core-demo.jsp").forward(req, resp);
    }
}
