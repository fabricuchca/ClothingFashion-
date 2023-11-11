package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Recommendations;

import java.util.List;

public interface IRecommendationsService {
    public void insert(Recommendations recommendations);
    public void delete(int idRecommendations);
    public Recommendations listId(int idRecommendations);
    List<Recommendations> findByCategoryTag(String categoryTag);
    public List<Recommendations>list();

}
