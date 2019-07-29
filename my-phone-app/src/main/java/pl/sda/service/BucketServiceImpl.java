package pl.sda.service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class BucketServiceImpl implements BucketService {

    @Override
    public void addProduct(HttpServletRequest req, Long productId) {
        List<Long> bucket = (List<Long>) req.getSession().getAttribute("bucket");
        if (bucket == null){
            bucket = new ArrayList<>();
            req.getSession().setAttribute("bucket", bucket);
        }
        bucket.add(productId);
    }

    public List<Long> getProductsId(HttpServletRequest request){
        return (List<Long>) request.getSession().getAttribute("bucket");
    }


    @Override
    public void deleteProduct(HttpServletRequest req, Long productId) {
        List<Long> bucket = (List<Long>) req.getSession().getAttribute("bucket");

        if (bucket != null){
            bucket.remove(productId);
        }
    }

    @Override
    public void cleanBucket(HttpServletRequest request) {
        ((List<Long>) request.getSession().getAttribute("bucket")).clear();
    }
}
