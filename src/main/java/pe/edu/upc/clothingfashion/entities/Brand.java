package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name="Brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBrand;
    @Column(name="nameBrand",nullable = false,length = 40)
    private String nameBrand;
    @Column(name="country",nullable = false,length = 55)
    private String country;
    @Column(name="webSite",nullable = false,length = 200)
    private String webSite;
    @Column(name="description",nullable = false,length = 60)
    private String description;
    @Column(name="tags",nullable = false,length = 50)
    private String tags;

    public Brand() {
    }

    public Brand(int idBrand, String nameBrand, String country, String webSite, String description, String tags) {
        this.idBrand = idBrand;
        this.nameBrand = nameBrand;
        this.country = country;
        this.webSite = webSite;
        this.description = description;
        this.tags = tags;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String gettags() {
        return tags;
    }

    public void settags(String tags) {
        this.tags = tags;
    }
}
