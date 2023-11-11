package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.clothingfashion.entities.Users;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	public Users findByUsername(String username);
	//BUSCAR POR NOMBRE
	@Query("select count(u.username) from Users u where u.username =:username")
	public int buscarUsername(@Param("username") String nombre);
	List<Users> findByNameUserAndLastNameUser(String nameUser, String lastNameUser);
	//INSERTAR ROLES
	@Transactional
	@Modifying
	@Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
	public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
	@Query(value = "SELECT u.name_user, COUNT(c.id_user)" +
			"            FROM User u inner join Closet c" +
			"            ON u.id_user = c.id_user" +
			"            GROUP BY u.name_user" +
			"            order BY COUNT(c.id_user)" +
			"            DESC LIMIT 1", nativeQuery = true)
	List<String[]> UserCloset();

}