package pe.edu.upc.clothingfashion.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Type_Clothing;
import pe.edu.upc.clothingfashion.repositories.ITypeClothingRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITypeClothingService;

import java.util.List;

@Service
public class TypeClothingServiceImplement implements ITypeClothingService {
    @Autowired
    private ITypeClothingRepository tpR;

    @Override
    public void insert(Type_Clothing typeClothing) {
        tpR.save(typeClothing);
    }

    @Override
    public List<Type_Clothing> list() {
        return tpR.findAll();
    }

    @Override
    public void delete(int idTypeClothing) {
        tpR.deleteById(idTypeClothing);
    }

    @Override
    public Type_Clothing listId(int idTypeClothing) {
        return tpR.findById(idTypeClothing).orElse(new Type_Clothing());
    }
}
