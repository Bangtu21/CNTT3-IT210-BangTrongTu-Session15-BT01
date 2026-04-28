package spring_boot.session15bt01.service.impl;

import org.springframework.stereotype.Service;
import spring_boot.session15bt01.model.Product;
import spring_boot.session15bt01.repository.ProductRepository;
import spring_boot.session15bt01.service.ProductService;

import java.util.List;

@Service
public class ProductSerciceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductSerciceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> filterProduct(String category, Double maxPrice) {
        return productRepository
                .findByCategoryAndPriceLessThan(
                        category,
                        maxPrice,
                        0
                );
    }
}
