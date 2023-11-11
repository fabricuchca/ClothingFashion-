package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Clothing")
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClothing;
    @ManyToOne
    @JoinColumn(name="idSeason")
    private Season season;
    @ManyToOne
    @JoinColumn(name="idTexture")
    private Texture texture;
    @ManyToOne
    @JoinColumn(name="idColor")
    private Color color;
    @ManyToOne
    @JoinColumn(name="idEvent")
    private Event event;
    @ManyToOne
    @JoinColumn(name = "idCatalog")
    private Catalog catalog;
    @ManyToOne
    @JoinColumn(name = "idStore")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "idCloset")
    private Closet closet;
    @ManyToOne
    @JoinColumn(name = "idBrand")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "idTypeClothing")
    private Type_Clothing typeClothing;

    public Clothing() {
    }

    public Clothing(int idClothing, Season season, Texture texture, Color color, Event event, Catalog catalog, Store store, Closet closet, Brand brand, Type_Clothing typeClothing) {
        this.idClothing = idClothing;
        this.season = season;
        this.texture = texture;
        this.color = color;
        this.event = event;
        this.catalog = catalog;
        this.store = store;
        this.closet = closet;
        this.brand = brand;
        this.typeClothing = typeClothing;
    }

    public int getIdClothing() {
        return idClothing;
    }

    public void setIdClothing(int idClothing) {
        this.idClothing = idClothing;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Type_Clothing getTypeClothing() {
        return typeClothing;
    }

    public void setTypeClothing(Type_Clothing typeClothing) {
        this.typeClothing = typeClothing;
    }
}
