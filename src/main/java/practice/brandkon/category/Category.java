package practice.brandkon.category;

import jakarta.persistence.*;
import practice.brandkon.brand.CategoryBrand;
import java.util.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String imageUrl;

    @OneToMany(mappedBy = "category")
    private List<CategoryBrand> categoryBrand;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
