package spring_boot.session15bt01.service;

import spring_boot.session15bt01.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> filterProduct(String category, Double maxPrice);
}
