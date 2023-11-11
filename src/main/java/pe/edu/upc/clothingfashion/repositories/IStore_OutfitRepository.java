package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Store_Outfit;
@Repository
public interface IStore_OutfitRepository extends JpaRepository<Store_Outfit, Integer> {
}
