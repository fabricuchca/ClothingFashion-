package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idColor;
    @Column(name = "nameColor",nullable = false,length = 20)
    private String nameColor;
    @Column(name = "description",nullable = false,length = 40)
    private String description;
    @Column(name = "typeColor",nullable = false,length = 40)
    private String typeColor;
    public Color() {
    }

    public Color(int idColor, String nameColor, String description, String typeColor) {
        this.idColor = idColor;
        this.nameColor = nameColor;
        this.description = description;
        this.typeColor = typeColor;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeColor() {
        return typeColor;
    }

    public void setTypeColor(String typeColor) {
        this.typeColor = typeColor;
    }
}
