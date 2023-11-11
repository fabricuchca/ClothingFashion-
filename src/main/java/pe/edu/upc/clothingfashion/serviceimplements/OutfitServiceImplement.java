package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Outfit;
import pe.edu.upc.clothingfashion.entities.Recommendations;
import pe.edu.upc.clothingfashion.repositories.IOutfitRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IOutfirService;

import java.util.List;

@Service
public class OutfitServiceImplement implements IOutfirService {
    @Autowired
    private IOutfitRepository oR;

    @Override
    public void insert(Outfit outfit) {
        oR.save(outfit);
    }

    @Override
    public void delete(int idOutfit) {
        oR.deleteById(idOutfit);
    }

    @Override
    public Outfit listId(int idOutfit) {
        return oR.findById(idOutfit).orElse(new Outfit());
    }

    @Override
    public List<Outfit> findBystyleOutfit(String styleOutfit) {
        return oR.findBystyleOutfit(styleOutfit);
    }
    @Override
    public List<Outfit> list() {
        return oR.findAll();
    }


}
