package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComments;
    @Column(name = "descriptionComment",nullable = false,length = 500)
    private String descriptionComment;
    @Column(name = "dateComment",nullable = false)
    private LocalDate dateComment;
    @Column(name = "score",nullable = false,length = 1)
    private int score;
    @ManyToOne
    @JoinColumn(name = "idOutfit")
    private Outfit outfit;

    public Comments() {
    }

    public Comments(int idComments, String descriptionComment, LocalDate dateComment, int score, Outfit outfit) {
        this.idComments = idComments;
        this.descriptionComment = descriptionComment;
        this.dateComment = dateComment;
        this.score = score;
        this.outfit = outfit;
    }

    public int getIdComments() {
        return idComments;
    }

    public void setIdComments(int idComments) {
        this.idComments = idComments;
    }

    public String getDescriptionComment() {
        return descriptionComment;
    }

    public void setDescriptionComment(String descriptionComment) {
        this.descriptionComment = descriptionComment;
    }

    public LocalDate getDateComment() {
        return dateComment;
    }

    public void setDateComment(LocalDate dateComment) {
        this.dateComment = dateComment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
