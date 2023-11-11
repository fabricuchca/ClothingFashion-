package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table
public class Recommendations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecommendations;
    @Column(name = "title",nullable = false,length = 50)
    private String title;
    @Column(name = "author",nullable = false,length = 40)
    private String author;
    @Column(name = "calification",nullable = false,length = 1)
    private int calification;
    @Column(name = "addicionalLink",nullable = false,length = 1000)
    private String addicionalLink;
    @Column(name = "categoryTag",nullable = false,length = 50)
    private String categoryTag;

    public Recommendations() {
    }

    public Recommendations(int idRecommendations, String title, String author, int calification, String addicionalLink, String categoryTag) {
        this.idRecommendations = idRecommendations;
        this.title = title;
        this.author = author;
        this.calification = calification;
        this.addicionalLink = addicionalLink;
        this.categoryTag = categoryTag;
    }

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
