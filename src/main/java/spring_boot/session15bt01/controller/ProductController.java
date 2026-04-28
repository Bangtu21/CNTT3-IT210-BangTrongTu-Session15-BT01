package spring_boot.session15bt01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring_boot.session15bt01.service.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", null);
        return "index";
    }

    @GetMapping("/search")
    public String search(String category,
                         Double maxPrice,
                         Model model) {

        model.addAttribute(
                "products",
                productService.filterProduct(category, maxPrice)
        );

        return "index";
    }
}
