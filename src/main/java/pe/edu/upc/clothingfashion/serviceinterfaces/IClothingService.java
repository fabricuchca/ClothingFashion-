package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Clothing;
import java.util.List;

public interface IClothingService {

    public void insert(Clothing clothing);
    public void delete(int idClothing);
    public List<Clothing> list();
    public Clothing listId(int idClothing);
    List<Clothing> findByColor(int color);
    List<Clothing> findBySeason(int season);
    List<Clothing> findByTexture(int texture);
    List<Clothing> findByBrand(int brand);
    List<Clothing> findByEvent(int event);
    List<Clothing>findByNameSeasonAndNameTypeClothing(String nameSeason,String nameTypeClothing);
}
