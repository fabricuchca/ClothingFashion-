package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Closet;
import java.util.List;

public interface IClosetService {
    public void insert(Closet closet);
    public void delete(int idCloset);
    public Closet listId(int idCloset);
    List<Closet> findBystyleCloset(String styleCloset);
    public List<Closet>list();

}
