package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.repositories.IClosetRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IClosetService;

import java.util.List;

@Service
public class ClosetServiceImplement implements IClosetService {
    @Autowired
    private IClosetRepository aR;
    @Override
    public void insert(Closet closet) {
        aR.save(closet);
    }

    @Override
    public void delete(int idCloset) {
        aR.deleteById(idCloset);
    }

    @Override
    public Closet listId(int idCloset) {
        return aR.findById(idCloset).orElse(new Closet());
    }

    @Override
    public List<Closet> findBystyleCloset(String styleCloset) {
        return aR.findBystyleCloset(styleCloset);
    }
    @Override
    public List<Closet> list() {
        return aR.findAll();
    }

}
