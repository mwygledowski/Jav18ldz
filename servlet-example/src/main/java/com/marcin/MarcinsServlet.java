package com.marcin;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MarcinsServlet")
public class MarcinsServlet extends HttpServlet {

    final static Logger logger = Logger.getLogger(MarcinsServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>Log test<h3>");

        logTest();
    }

    private void logTest() {
        logger.trace("Trace Message Marcin!");
        logger.debug("Debug Message Marcin!");
        logger.info("Info Message Marcin!");
        logger.warn("Warn Message Marcin!");
        logger.error("Error Message Marcin!");
        logger.fatal("Fatal Message Marcin!");
    }
}
