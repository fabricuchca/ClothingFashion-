package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Clothing;
import pe.edu.upc.clothingfashion.repositories.IClothingRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IClothingService;

import java.util.List;

@Service
public class ClothingServiceImplement implements IClothingService {
    @Autowired
    private IClothingRepository cloR;
    @Override
    public void insert(Clothing clothing) {
        cloR.save(clothing);
    }

    @Override
    public void delete(int idClothing) {
        cloR.deleteById(idClothing);
    }

    @Override
    public List<Clothing> list() {
        return cloR.findAll();
    }

    @Override
    public Clothing listId(int idClothing) {
        return cloR.findById(idClothing).orElse(new Clothing());
    }

    @Override
    public List<Clothing> findByColor(int color) {
        return cloR.findByColor(color);
    }

    @Override
    public List<Clothing> findBySeason(int season) {
        return cloR.findBySeason(season);
    }

    @Override
    public List<Clothing> findByTexture(int texture) {
        return cloR.findByTexture(texture);
    }

    @Override
    public List<Clothing> findByBrand(int brand) {
        return cloR.findByBrand(brand);
    }

    @Override
    public List<Clothing> findByEvent(int event) {
        return cloR.findByEvent(event);
    }

    @Override
    public List<Clothing> findByNameSeasonAndNameTypeClothing(String nameSeason, String nameTypeClothing) {
        return cloR.findByNameSeasonAndNameTypeClothing(nameSeason,nameTypeClothing);
    }

}
