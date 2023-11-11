package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Comments;
import java.time.LocalDate;
import java.util.List;

public interface ICommentservice {
    public void insert(Comments comments);
    public void delete(int idComments);
    public Comments listId(int idComments);
    List<Comments> findByDateComment(LocalDate dateComment);
    public List<Comments>list();

}
