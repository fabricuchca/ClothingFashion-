package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Store_Outfit;

import java.util.List;

public interface IStore_OutfitService {
    public void insert(Store_Outfit store_outfit);
    public void delete(int idStore_Outfit);
    public Store_Outfit listId(int idStore_Outfit);
    public List<Store_Outfit> list();
}
