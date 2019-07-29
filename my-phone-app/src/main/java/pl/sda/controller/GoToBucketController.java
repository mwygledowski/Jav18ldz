package pl.sda.controller;

import pl.sda.model.Product;
import pl.sda.service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/koszyk")
public class GoToBucketController extends HttpServlet {

    BucketService bucketService = new BucketServiceImpl();
    BillService billService = new BillServiceImpl();
    ProductService productService = new ProductServiceImpl();
//    AuthenticationService authenticationService = new AuthenticationServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = bucketService.getProductsId(req).stream()
                .map(i -> productService.getProduct(i)).collect(Collectors.toList());
        req.setAttribute("products", products);
        req.setAttribute("toPay", billService.getFinalBill(products));
//        req.setAttribute("isLogin", authenticationService.isAuthenticated(req));
        req.getRequestDispatcher("/WEB-INF/view/bucket.jsp").forward(req, resp);
    }
}
