package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Recommendations;
import pe.edu.upc.clothingfashion.repositories.IRecommendationsRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRecommendationsService;

import java.util.List;

@Service
public class RecommendationsImplement implements IRecommendationsService {
    private IRecommendationsRepository rR;
    @Override
    public void insert(Recommendations recommendations) {
        rR.save(recommendations);
    }

    @Override
    public void delete(int idRecommendations) {
        rR.deleteById(idRecommendations);
    }

    @Override
    public Recommendations listId(int idRecommendations) {
        return rR.findById(idRecommendations).orElse(new Recommendations());
    }

    @Override
    public List<Recommendations> findByCategoryTag (String categoryTag){
        return rR.findByCategoryTag(categoryTag);
    }

    @Override
    public List<Recommendations> list() {
        return rR.findAll();
    }
}
