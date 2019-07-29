package pl.sda.controller;

import pl.sda.service.BucketService;
import pl.sda.service.BucketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/usun-z-koszyka")
public class DeleteFromBucket extends HttpServlet {

    BucketService bucketService = new BucketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long productId = Long.valueOf(req.getParameter("productId"));
        bucketService.deleteProduct(req, productId);
        resp.sendRedirect("/koszyk");
    }
}
