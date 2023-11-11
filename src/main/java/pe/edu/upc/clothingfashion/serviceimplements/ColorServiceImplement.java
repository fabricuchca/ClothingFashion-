package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Color;
import pe.edu.upc.clothingfashion.repositories.IColorRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IColorService;

import java.util.List;

@Service
public class ColorServiceImplement implements IColorService {
    @Autowired
    private IColorRepository cR;
    @Override
    public void insert(Color color) {
        cR.save(color);

    }
    @Override
    public List<Color> list() {
        return cR.findAll();
    }

    @Override
    public Color listId(int idColor) {
        return cR.findById(idColor).orElse(new Color());
    }
    @Override
    public void delete(int idColor) {
        cR.deleteById(idColor);
    }
}
