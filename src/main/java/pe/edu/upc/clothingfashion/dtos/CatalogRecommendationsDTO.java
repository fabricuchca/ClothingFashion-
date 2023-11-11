package pe.edu.upc.clothingfashion.dtos;

public class CatalogRecommendationsDTO {
    private int id_catalog;
    private int id_recommendations;
    private String recommendation_title;
    private int calification;

    public int getId_catalog() {
        return id_catalog;
    }

    public void setId_catalog(int id_catalog) {
        this.id_catalog = id_catalog;
    }

    public int getId_recommendations() {
        return id_recommendations;
    }

    public void setId_recommendations(int id_recommendations) {
        this.id_recommendations = id_recommendations;
    }

    public String getRecommendation_title() {
        return recommendation_title;
    }

    public void setRecommendation_title(String recommendation_title) {
        this.recommendation_title = recommendation_title;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }
}
