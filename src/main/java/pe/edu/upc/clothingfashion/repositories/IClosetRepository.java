package pe.edu.upc.clothingfashion.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Closet;
import java.util.List;
@Repository
public interface IClosetRepository extends JpaRepository<Closet, Integer>
{
    List<Closet> findBystyleCloset(String styleCloset);

}
