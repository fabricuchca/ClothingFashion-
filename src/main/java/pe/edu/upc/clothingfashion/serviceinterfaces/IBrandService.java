package pe.edu.upc.clothingfashion.serviceinterfaces;


import pe.edu.upc.clothingfashion.entities.Brand;

import java.util.List;

public interface IBrandService {
    public void insert(Brand brand);
    public void delete(int idBrand);
    public Brand listId(int idBrand);
    public List<Brand>list();
}
