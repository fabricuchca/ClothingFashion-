package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Outfit")
public class Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOutfit;
    @Column(name = "nameOutfit",nullable = false,length = 50)
    private String nameOutfit;
    @Column(name = "styleOutfit",nullable = false,length = 50)
    private String styleOutfit;
    @Column(name = "clothesNumber",nullable = false,length = 2)
    private int clothesNumber;
    @Column(name = "creationDate",nullable = false)
    private LocalDate creationDate;
    @ManyToOne
    @JoinColumn(name = "idCatalog")
    private Catalog catalog;

    public Outfit() {
    }

    public Outfit(int idOutfit, String nameOutfit, String styleOutfit, int clothesNumber, LocalDate creationDate, Catalog catalog) {
        this.idOutfit = idOutfit;
        this.nameOutfit = nameOutfit;
        this.styleOutfit = styleOutfit;
        this.clothesNumber = clothesNumber;
        this.creationDate = creationDate;
        this.catalog = catalog;
    }

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
