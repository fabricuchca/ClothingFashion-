package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Texture;
import pe.edu.upc.clothingfashion.repositories.ITextureRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITextureService;

import java.util.List;

@Service
public class TextureServiceImplement implements ITextureService {
    @Autowired
    private ITextureRepository tR;
    @Override
    public void insert(Texture texture) {
        tR.save(texture);
    }

    @Override
    public void delete(int idTexture) {
        tR.deleteById(idTexture);
    }
    @Override
    public List<Texture> list() {
        return tR.findAll();
    }

    @Override
    public Texture listId(int idTexture) {
        return tR.findById(idTexture).orElse(new Texture());
    }
}
