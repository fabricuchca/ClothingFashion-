package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Catalog;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class OutfitDTO {
    private int idOutfit;
    private String nameOutfit;
    private String styleOutfit;
    private int clothesNumber;
    private LocalDate creationDate;
    private Catalog catalog;

    public int getIdOutfit() {
        return idOutfit;
    }

    public void setIdOutfit(int idOutfit) {
        this.idOutfit = idOutfit;
    }

    public String getNameOutfit() {
        return nameOutfit;
    }

    public void setNameOutfit(String nameOutfit) {
        this.nameOutfit = nameOutfit;
    }

    public String getstyleOutfit() {
        return styleOutfit;
    }

    public void setstyleOutfit(String styleOutfit) {
        this.styleOutfit = styleOutfit;
    }

    public int getClothesNumber() {
        return clothesNumber;
    }

    public void setClothesNumber(int clothesNumber) {
        this.clothesNumber = clothesNumber;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
