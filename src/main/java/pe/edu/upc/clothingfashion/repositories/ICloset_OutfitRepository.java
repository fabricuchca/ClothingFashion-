package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
@Repository
public interface ICloset_OutfitRepository extends JpaRepository<Closet_Outfit, Integer> {

}
