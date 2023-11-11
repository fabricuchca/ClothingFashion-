package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Outfit;
import pe.edu.upc.clothingfashion.entities.Store;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Store_OutfitDTO {
    private int idStore_Outfit;
    private LocalDate availabilityDate;
    private Store store;
    private Outfit outfit;

    public int getIdStore_Outfit() {
        return idStore_Outfit;
    }

    public void setIdStore_Outfit(int idStore_Outfit) {
        this.idStore_Outfit = idStore_Outfit;
    }

    public LocalDate getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(LocalDate availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
