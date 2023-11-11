package pe.edu.upc.clothingfashion.dtos;

public class BrandDTO {
    private int idBrand;
    private String nameBrand;
    private String country;
    private String webSite;
    private String description;
    private String tags;

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
