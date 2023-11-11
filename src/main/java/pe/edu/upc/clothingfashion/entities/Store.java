package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStore;
    @Column(name = "nameStore",nullable = false,length = 20)
    private String nameStore;
    @Column(name = "addressStore",nullable = false,length = 50)
    private String addressStore;
    @Column(name = "telephoneStore",nullable = false,length = 9)
    private String telephoneStore;
    @Column(name = "postalCode",nullable = false,length = 20)
    private String postalCode;
    @Column(name = "paymentMethod",nullable = false,length = 20)
    private String paymentMethod;
    @Column(name = "latitude",nullable = false,length = 10)
    private String latitude;
    @Column(name = "longitude",nullable = false,length = 10)
    private String longitude;
    @ManyToOne
    @JoinColumn(name = "idCatalog")
    private Catalog catalog;

    public Store() {
    }

    public Store(int idStore, String nameStore, String addressStore, String telephoneStore, String postalCode, String paymentMethod, String latitude, String longitude, Catalog catalog) {
        this.idStore = idStore;
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.telephoneStore = telephoneStore;
        this.postalCode = postalCode;
        this.paymentMethod = paymentMethod;
        this.latitude = latitude;
        this.longitude = longitude;
        this.catalog = catalog;
    }

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getAddressStore() {
        return addressStore;
    }

    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public String getTelephoneStore() {
        return telephoneStore;
    }

    public void setTelephoneStore(String telephoneStore) {
        this.telephoneStore = telephoneStore;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
