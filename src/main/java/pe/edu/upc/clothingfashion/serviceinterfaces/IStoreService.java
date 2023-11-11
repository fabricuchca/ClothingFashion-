package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Store;

import java.util.List;

public interface IStoreService {
    public void insert(Store store);
    public void delete(int idStore);
    public List<Store> list();
    public Store listId(int idStore);
}
