package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Color;

import java.util.List;

public interface IColorService {
    public void insert(Color color);
    public void delete(int idColor);
    public Color listId(int idColor);
    public List<Color> list();
}
