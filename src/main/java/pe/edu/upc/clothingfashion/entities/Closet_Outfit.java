package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Closet_Outfit {
    @Id
    @GeneratedValue
    private int idCloset_Outfit;
    @Column(name = "additionDate", nullable = false)
    private LocalDate additionDate;
    @ManyToOne
    @JoinColumn(name = "idOutfit")
    private Outfit outfit;
    @ManyToOne
    @JoinColumn(name = "idCloset")
    private Closet closet;

    public Closet_Outfit() {
    }

    public Closet_Outfit(int idCloset_Outfit, LocalDate additionDate, Outfit outfit, Closet closet) {
        this.idCloset_Outfit = idCloset_Outfit;
        this.additionDate = additionDate;
        this.outfit = outfit;
        this.closet = closet;
    }

    public int getIdCloset_Outfit() {
        return idCloset_Outfit;
    }

    public void setIdCloset_Outfit(int idCloset_Outfit) {
        this.idCloset_Outfit = idCloset_Outfit;
    }

    public LocalDate getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(LocalDate additionDate) {
        this.additionDate = additionDate;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }
}

