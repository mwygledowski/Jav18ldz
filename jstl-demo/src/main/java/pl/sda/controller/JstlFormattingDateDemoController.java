package pl.sda.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@WebServlet("/jstl-formatting-date-demo")
public class JstlFormattingDateDemoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("currentDate", new Date());
        req.getRequestDispatcher("/jstl-formatting-date-demo.jsp").forward(req, resp);
    }
}
