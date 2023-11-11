package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Recommendations;

import java.util.List;
@Repository
public interface IRecommendationsRepository extends JpaRepository<Recommendations, Integer> {
    List<Recommendations>findByCategoryTag(String categoryTag);
}
