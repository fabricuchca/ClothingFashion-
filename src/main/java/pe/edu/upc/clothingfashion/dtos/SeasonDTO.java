package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class SeasonDTO {
    private int idSeason;
    private String nameSeason;
    private LocalDate startDate;
    private LocalDate endDate;
    private String descriptionSeason;

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
