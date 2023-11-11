package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;

public class RecommendationsDTO {
    private int idRecommendations;
    private String title;
    private String author;
    private int calification;
    private String addicionalLink;
    private String categoryTag;

    public int getIdRecommendations() {
        return idRecommendations;
    }

    public void setIdRecommendations(int idRecommendations) {
        this.idRecommendations = idRecommendations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public String getAddicionalLink() {
        return addicionalLink;
    }

    public void setAddicionalLink(String addicionalLink) {
        this.addicionalLink = addicionalLink;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }
}
