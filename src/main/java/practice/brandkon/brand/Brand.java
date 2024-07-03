package practice.brandkon.brand;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String imageUrl;

    @ManyToOne
    private CategoryBrand categoryBrand;

//    @ManyToOne
//    private Category category;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    //    public Category getCategory() {
//        return category;
//    }


    public CategoryBrand getCategoryBrand() {
        return categoryBrand;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
