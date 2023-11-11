package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.repositories.ICatalogRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogService;

import java.util.List;

@Service
public class CatalogServiceImplement implements ICatalogService {
    @Autowired
    private ICatalogRepository catR;
    @Override
    public void insert(Catalog catalog) {
        catR.save(catalog);
    }

    @Override
    public void delete(int idCatalog) {
        catR.deleteById(idCatalog);
    }

    @Override
    public List<String[]> getCountCatalogRecommendations() {
        return catR.CatalogRecommendations();
    }
    @Override
    public List<Catalog> list() {
        return catR.findAll();
    }

    @Override
    public Catalog listId(int idCatalog) {
        return catR.findById(idCatalog).orElse(new Catalog());
    }
}
