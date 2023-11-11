package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Users;
import pe.edu.upc.clothingfashion.repositories.UserRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService{
    @Autowired
    private UserRepository uR;
    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Users listId(Long id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public List<Users> findByNameUserAndLastNameUser(String nameUser, String lastNameUser) {
        return uR.findByNameUserAndLastNameUser(nameUser, lastNameUser);
    }
    @Override
    public List<String[]> getCountClosetByUser() {
        return uR.UserCloset();
    }
    @Override
    public List<Users> list() {
        return uR.findAll();
    }
}
