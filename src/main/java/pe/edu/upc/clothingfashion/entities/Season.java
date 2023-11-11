package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Season")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeason;
    @Column(name = "nameSeason",nullable = false,length = 20)
    private String nameSeason;
    @Column(name = "startDate",nullable = false)
    private LocalDate startDate;
    @Column(name = "endDate",nullable = false)
    private LocalDate endDate;
    @Column(name = "descriptionSeason",nullable = false,length = 50)
    private String descriptionSeason;
    public Season() {
    }
    public Season(int idSeason, String nameSeason, LocalDate startDate, LocalDate endDate, String descriptionSeason) {
        this.idSeason = idSeason;
        this.nameSeason = nameSeason;
        this.startDate = startDate;
        this.endDate = endDate;
        this.descriptionSeason = descriptionSeason;
    }

    public int getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(int idSeason) {
        this.idSeason = idSeason;
    }

    public String getNameSeason() {
        return nameSeason;
    }

    public void setNameSeason(String nameSeason) {
        this.nameSeason = nameSeason;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescriptionSeason() {
        return descriptionSeason;
    }

    public void setDescriptionSeason(String descriptionSeason) {
        this.descriptionSeason = descriptionSeason;
    }
}
