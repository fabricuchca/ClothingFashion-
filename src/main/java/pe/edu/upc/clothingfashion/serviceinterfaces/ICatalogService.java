package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.entities.Color;

import java.util.List;

public interface ICatalogService {
    public void insert(Catalog catalog);
    public void delete(int idCatalog);
    List<String[]> getCountCatalogRecommendations();
    public Catalog listId(int idCatalog);
    public List<Catalog>list();
}
