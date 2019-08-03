package pl.sda.service;

import java.util.List;

public interface OrderService {
    void order(String userLogin, List<Long> products);
}
