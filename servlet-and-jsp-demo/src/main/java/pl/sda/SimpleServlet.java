package pl.sda;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simple-servlet")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        writer.print("<html><body><h1> Hello ");
        if(StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)){
            writer.print(getFullName(firstName, lastName));
        }else{
            writer.print("Stranger");
        }
        writer.print("</h1></body></html>");
    }

    private String getFullName(String firstName, String lastName) {
        return StringUtils.defaultString(firstName, "") + " " + StringUtils.defaultString(lastName, "");
    }
}
