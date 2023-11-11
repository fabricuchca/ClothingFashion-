package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Texture;
@Repository
public interface ITextureRepository extends JpaRepository<Texture, Integer> {
}
