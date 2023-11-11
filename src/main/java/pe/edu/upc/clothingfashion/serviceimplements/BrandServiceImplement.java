package pe.edu.upc.clothingfashion.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.repositories.IBrandRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IBrandService;

import java.util.List;

@Service
public class BrandServiceImplement implements IBrandService {
    @Autowired
    private IBrandRepository mR;
    @Override
    public void insert(Brand brand) {
        mR.save(brand);
    }

    @Override
    public void delete(int idBrand) {
        mR.deleteById(idBrand);
    }

    @Override
    public List<Brand> list() {
        return mR.findAll();
    }

    @Override
    public Brand listId(int idBrand) {
        return mR.findById(idBrand).orElse(new Brand());
    }
}
