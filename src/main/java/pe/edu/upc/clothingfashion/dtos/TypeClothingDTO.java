package pe.edu.upc.clothingfashion.dtos;

public class TypeClothingDTO {
    private int idTypeClothing;
    private String nameTypeClothing;
    private String size;
    private String gender;
    private String description;
    private String category;
    private String occasion;

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
