package spring_boot.session15bt01.repository;

import org.springframework.stereotype.Repository;
import spring_boot.session15bt01.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1L, "iPhone 14", "Điện thoại", 9500000.0, 5));
        products.add(new Product(2L, "Samsung A55", "Điện thoại", 8000000.0, 0));
        products.add(new Product(3L, "Xiaomi 14", "Điện thoại", 10000000.0, 10));
        products.add(new Product(4L, "Macbook Air M2", "Laptop", 22000000.0, 3));
        products.add(new Product(5L, "Dell XPS 13", "Laptop", 28000000.0, 0));
        products.add(new Product(6L, "OPPO Reno", "Điện thoại", 7000000.0, 8));
    }

    public List<Product> findByCategoryAndPriceLessThan(
            String category,
            Double maxPrice,
            Integer stockQuantity
    ) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .filter(p -> p.getPrice() <= maxPrice)
                .filter(p -> p.getStockQuantity() > stockQuantity)
                .collect(Collectors.toList());
    }
}
