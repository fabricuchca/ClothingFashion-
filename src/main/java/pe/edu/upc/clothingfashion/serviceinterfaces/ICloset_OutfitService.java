package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
import pe.edu.upc.clothingfashion.entities.Catalog;

import java.util.List;

public interface ICloset_OutfitService {
    public void insert(Closet_Outfit closet_outfit);
    public void delete(int idCloset_Outfit);
    public Closet_Outfit listId(int idCloset_Outfit);
    public List<Closet_Outfit> list();
}
