package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Outfit;
import java.time.LocalDate;

public class Closet_OutfitDTO {
    private int idCloset_Outfit;
    private LocalDate additionDate;
    private Outfit outfit;
    private Closet closet;

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
