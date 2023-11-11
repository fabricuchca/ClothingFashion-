package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Outfit;
import java.util.List;

public interface IOutfirService {
    public void insert(Outfit outfit);
    public void delete(int idOutfit);
    public Outfit listId(int idOutfit);
    List<Outfit> findBystyleOutfit(String styleOutfit);
    public List<Outfit>list();
}
