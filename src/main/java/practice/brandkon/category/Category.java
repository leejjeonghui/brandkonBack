package practice.brandkon.category;

import jakarta.persistence.*;
import practice.brandkon.brand.CategoryBrand;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String imageUrl;

    @ManyToOne
    CategoryBrand categoryBrand;
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
