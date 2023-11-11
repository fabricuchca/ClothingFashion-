package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    public void delete(Long id);
    public Role listId(Long idRole);
    public List<Role> list();
}
