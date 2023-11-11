package pe.edu.upc.clothingfashion.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Texture")
public class Texture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTexture;
    @Column(name = "nameTexture",nullable = false,length = 20)
    private String nameTexture;
    @Column(name = "creationDate",nullable = false)
    private LocalDate creationDate;
    @Column(name = "material",nullable = false,length = 20)
    private String material;
    public Texture() {
    }
    public Texture(int idTexture, String nameTexture, LocalDate creationDate, String material) {
        this.idTexture = idTexture;
        this.nameTexture = nameTexture;
        this.creationDate = creationDate;
        this.material = material;
    }
    public int getIdTexture() {
        return idTexture;
    }
    public void setIdTexture(int idTexture) {
        this.idTexture = idTexture;
    }
    public String getNameTexture() {
        return nameTexture;
    }
    public void setNameTexture(String nameTexture) {
        this.nameTexture = nameTexture;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
