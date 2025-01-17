package practice.brandkon.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    // GET /products?sort=POPULAR
    // GET /products?brandId=34&sort=RECENT
    // GET /products?brandId=34&sort=POPULAR
    // GET /products?categoryId=6&sort=POPULAR
    @GetMapping("/products")
    public List<ProductResponse> findAll(
            @RequestParam(required = false) Long brandId,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) String sort
    ) {
        return productService.findAll(brandId, categoryId, sort);
    }

    @GetMapping("/products/{id}")
    public ProductDetailResponse findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PatchMapping("product/{id}")
    public void updateSales(@PathVariable Long id) throws Exception {
         productService.updateSales(id);
    }
}
