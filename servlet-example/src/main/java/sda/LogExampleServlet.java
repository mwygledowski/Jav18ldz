package sda;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LogExampleServlet")
public class LogExampleServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(LogExampleServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Zajrzyj do konsoli oraz katalogu logs</h1>");

        System.out.println("!!!!!!!!!!!!!!!!!!! Log z System.out.println() !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        logger.trace("This is trace");
        logger.debug("This is debug");
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
        logger.fatal("This is fatal");
    }
}
