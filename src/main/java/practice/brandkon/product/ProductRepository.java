package practice.brandkon.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByOrderBySalesDesc();
    List<Product> findAllByBrandId(Long brandId);
    List<Product> findAllByBrandIdOrderBySalesDesc(Long brandId);
}