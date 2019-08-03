package pl.sda.controller;

import pl.sda.model.Brand;
import pl.sda.model.Product;
import pl.sda.service.ProductService;
import pl.sda.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/produkty")
public class ShowProductsController extends HttpServlet {

    private final ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> filteredBrands = getBrands(req);

        req.setAttribute("checkedBrands", filteredBrands);
        req.setAttribute("brands", Brand.values());
        req.setAttribute("products", filteredBrands.isEmpty() ?
                productService.getProducts() : productService.getProductsByBrand(filteredBrands));

        req.getRequestDispatcher("/WEB-INF/view/products.jsp").forward(req, resp);
    }

    private List<Brand> getBrands(HttpServletRequest req) {
        String[] brands = req.getParameterMap().get("marka");
        return brands == null ? new ArrayList<>()
                : Arrays.asList(brands).stream().map(b -> Brand.valueOf(b)).collect(Collectors.toList());
    }
}
