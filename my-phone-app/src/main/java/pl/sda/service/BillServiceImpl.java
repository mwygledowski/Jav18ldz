package pl.sda.service;

import pl.sda.model.Product;

import java.math.BigDecimal;
import java.util.List;

public class BillServiceImpl implements BillService {

    public BigDecimal getFinalBill(List<Product> products){
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product: products) {
            sum = sum.add(product.getPrice());
        }
        return sum;
    }
}
