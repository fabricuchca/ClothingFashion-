package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.entities.Recommendations;
import pe.edu.upc.clothingfashion.repositories.ICommentsRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICommentservice;

import java.time.LocalDate;
import java.util.List;
@Service
public class CommentsServiceImplement implements ICommentservice {
    @Autowired
    private ICommentsRepository comR;
    @Override
    public void insert(Comments comments) {
        comR.save(comments);
    }

    @Override
    public void delete(int idComments) {
        comR.deleteById(idComments);
    }

    @Override
    public Comments listId(int idComments) {
        return comR.findById(idComments).orElse(new Comments());
    }

    @Override
    public List<Comments> findByDateComment(LocalDate dateComment) {
        return comR.findByDateComment(dateComment);
    }
    @Override
    public List<Comments> list() {
        return comR.findAll();
    }
}
