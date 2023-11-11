package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class TextureDTO {
    private int idTexture;
    private String nameTexture;
    private LocalDate creationDate;
    private String material;

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
