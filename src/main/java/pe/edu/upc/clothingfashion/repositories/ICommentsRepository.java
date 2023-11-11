package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.entities.Outfit;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ICommentsRepository extends JpaRepository<Comments, Integer> {
    List<Comments> findByDateComment(LocalDate dateComment);

}
