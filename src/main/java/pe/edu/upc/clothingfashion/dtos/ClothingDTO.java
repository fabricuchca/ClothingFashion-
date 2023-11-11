package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.*;

public class ClothingDTO {
    private int idClothing;
    private Season season;
    private Texture texture;
    private Color color;
    private Event event;
    private Catalog catalog;
    private Store store;
    private Closet closet;
    private Brand brand;
    private Type_Clothing type_clothing;

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

    public Type_Clothing getType_cloth() {
        return type_clothing;
    }

    public void setType_cloth(Type_Clothing type_cloth) {
        this.type_clothing = type_cloth;
    }
}
