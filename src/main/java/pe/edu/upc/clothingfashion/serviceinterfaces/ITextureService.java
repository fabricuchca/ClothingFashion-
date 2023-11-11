package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Texture;

import java.util.List;

public interface ITextureService {
    public void insert(Texture texture);
    public void delete(int idTexture);
    public Texture listId(int idTexture);
    public List<Texture> list();
}
