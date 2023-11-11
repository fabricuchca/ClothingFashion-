package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Outfit;
import java.time.LocalDate;

public class CommentsDTO {
    private int idComments;
    private String descriptionComment;
    private LocalDate dateComment;
    private int score;
    private Outfit outfit;

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
