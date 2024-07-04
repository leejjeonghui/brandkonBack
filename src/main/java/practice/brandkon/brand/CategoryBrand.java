package practice.brandkon.brand;

import jakarta.persistence.*;
import practice.brandkon.category.Category;

@Entity
public class CategoryBrand {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Brand brand;
}
