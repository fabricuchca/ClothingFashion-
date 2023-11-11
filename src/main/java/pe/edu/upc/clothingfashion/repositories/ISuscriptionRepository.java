package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Suscription;

import java.util.List;

@Repository
public interface ISuscriptionRepository extends JpaRepository<Suscription, Integer> {
   @Query(value="SELECT s.payment_Date, COUNT(id_user)" +
            "FROM Users u INNER JOIN Suscription s" +
            "ON u.id_user=s.users_id_user" +
            "GROUP BY u.id_user,s.payment_Date" +
            "ORDER BY COUNT(u.id_user)" +
            "DESC",nativeQuery = true)
   List<String[]> UserDate();
}
