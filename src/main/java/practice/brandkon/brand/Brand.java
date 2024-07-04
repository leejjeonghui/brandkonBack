package practice.brandkon.brand;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String imageUrl;

    @OneToMany(mappedBy = "brand")
    private List<CategoryBrand> categoryBrand;

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


    public List<CategoryBrand> getCategoryBrand() {
        return categoryBrand;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
