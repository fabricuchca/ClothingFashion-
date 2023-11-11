package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Store_Outfit")
public class Store_Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStore_Outfit;
    @Column(name = "availabilityDate", nullable = false)
    private LocalDate availabilityDate;
    @ManyToOne
    @JoinColumn(name = "idStore")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "idOutfit")
    private Outfit outfit;

    public Store_Outfit() {
    }

    public Store_Outfit(int idStore_Outfit, LocalDate availabilityDate, Store store, Outfit outfit) {
        this.idStore_Outfit = idStore_Outfit;
        this.availabilityDate = availabilityDate;
        this.store = store;
        this.outfit = outfit;
    }

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
