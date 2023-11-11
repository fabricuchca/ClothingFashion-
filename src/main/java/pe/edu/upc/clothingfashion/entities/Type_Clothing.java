package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name="TypeClothing")
public class Type_Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeClothing;
    @Column(name="nameTypeClothing",nullable = false,length = 50)
    private String nameTypeClothing;
    @Column(name="size",nullable = false,length = 30)
    private String size;
    @Column(name="gender",nullable = false,length = 30)
    private String gender;
    @Column(name="description",nullable = false,length = 60)
    private String description;
    @Column(name="category",nullable = false,length = 30)
    private String category;
    @Column(name="occasion",nullable = false,length = 30)
    private String occasion;

    public Type_Clothing() {
    }

    public Type_Clothing(int idTypeClothing, String nameTypeClothing, String size, String gender, String description, String category, String occasion) {
        this.idTypeClothing = idTypeClothing;
        this.nameTypeClothing = nameTypeClothing;
        this.size = size;
        this.gender = gender;
        this.description = description;
        this.category = category;
        this.occasion = occasion;
    }

    public int getIdTypeClothing() {
        return idTypeClothing;
    }

    public void setIdTypeClothing(int idTypeClothing) {
        this.idTypeClothing = idTypeClothing;
    }

    public String getNameTypeClothing() {
        return nameTypeClothing;
    }

    public void setNameTypeClothing(String nameTypeClothing) {
        this.nameTypeClothing = nameTypeClothing;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

}
