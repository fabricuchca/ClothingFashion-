package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Recommendations;
import java.util.List;

public class CatalogDTO {
    private int idCatalog;
    private List<Recommendations> recommendations;

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
