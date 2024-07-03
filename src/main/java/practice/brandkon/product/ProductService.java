package practice.brandkon.product;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductResponse> findAll(Long brandId, Long categoryId, String sort) {
        return productMapper.findAll(brandId, categoryId, sort);
    }

    public ProductDetailResponse findById(Long id) {
        Product product = productRepository.findById(id)
                .orElse(null);

        if (product == null) {
            throw new NoSuchElementException("상품을 찾을 수 없습니다 id: " + id);
        }

        return new ProductDetailResponse(
                product.getId(),
                product.getName(),
                product.getBrand().getId(),
                product.getBrand().getName(),
                product.getPrice(),
                product.getExpiryDays());
    }

    @Transactional
    public void updateSales(@PathVariable Long id) throws Exception {
        Product product = productRepository.findById(id).orElse(null);
        if (product==null){
             throw new Exception("존재하지 않는 상품");
        } else
            product.updateSales();
    }
}
