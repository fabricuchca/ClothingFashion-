package pe.edu.upc.clothingfashion.serviceinterfaces;


import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Type_Clothing;

import java.util.List;

public interface ITypeClothingService {
    public void insert(Type_Clothing typeClothing);
    public List<Type_Clothing>list();
    public void delete(int idTypeClothing);
    public Type_Clothing listId(int idTypeClothing);
}
