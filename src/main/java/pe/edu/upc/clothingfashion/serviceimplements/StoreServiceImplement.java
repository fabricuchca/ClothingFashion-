package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Store;
import pe.edu.upc.clothingfashion.repositories.IStoreRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IStoreService;

import java.util.List;

@Service
public class StoreServiceImplement implements IStoreService {
    @Autowired
    private IStoreRepository tiR;
    @Override
    public void insert(Store store) {
        tiR.save(store);
    }

    @Override
    public void delete(int idStore) {
        tiR.deleteById(idStore);
    }

    @Override
    public List<Store> list() {
        return tiR.findAll();
    }

    @Override
    public Store listId(int idStore) {
        return tiR.findById(idStore).orElse(new Store());
    }
}
