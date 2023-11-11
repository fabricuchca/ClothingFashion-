package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Outfit;
import java.util.List;
@Repository
public interface IOutfitRepository extends JpaRepository<Outfit, Integer> {
    List<Outfit> findBystyleOutfit(String styleOutfit);

}
