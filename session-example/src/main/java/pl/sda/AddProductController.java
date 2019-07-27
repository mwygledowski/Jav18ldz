package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/addProduct")
public class AddProductController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");

        HttpSession session = req.getSession();
        List<Product> products = (List<Product>) session.getAttribute("products");

        products.add(new Product(productName));

        resp.sendRedirect(req.getContextPath() + "/show-products");
    }
}
