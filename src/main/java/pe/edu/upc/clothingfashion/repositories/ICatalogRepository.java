package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.clothingfashion.entities.Catalog;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public interface ICatalogRepository extends JpaRepository<Catalog, Integer> {

    @Query(value = "SELECT" +
            "     c.id_catalog, " +
            "     r.id_recommendations, " +
            "     r.title AS recommendation_title, " +
            "     r.calification " +
            " FROM " +
            "     catalog AS c " +
            " JOIN " +
            "     recommendations AS r ON c.id_catalog = r.id_event " +
            " ORDER BY " +
            "     r.calification DESC " +
            " LIMIT 1; ", nativeQuery = true)
    List<String[]> CatalogRecommendations();
}
