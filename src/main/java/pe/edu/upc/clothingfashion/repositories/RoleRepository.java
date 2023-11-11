package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}