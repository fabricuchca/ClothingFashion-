package pe.edu.upc.clothingfashion.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCatalog;
    @OneToMany
    @JoinColumn(name="idEvent")
    private List<Recommendations> recommendations;

    public Catalog() {
    }

    public Catalog(int idCatalog, List<Recommendations> recommendations) {
        this.idCatalog = idCatalog;
        this.recommendations = recommendations;
    }

    public int getIdCatalog() {
        return idCatalog;
    }

    public void setIdCatalog(int idCatalog) {
        this.idCatalog = idCatalog;
    }

    public List<Recommendations> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendations> recommendations) {
        this.recommendations = recommendations;
    }
}
