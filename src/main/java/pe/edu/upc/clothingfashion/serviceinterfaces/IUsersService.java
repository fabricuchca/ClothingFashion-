package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Users;
import java.util.List;

public interface IUsersService {
    public void insert(Users users);
    public void delete(Long id);
    public Users listId(Long id);
    List<Users> findByNameUserAndLastNameUser(String nameUser, String lastNameUser);
    List<String[]> getCountClosetByUser();
    public List<Users>list();
}
