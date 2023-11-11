package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Suscription;
import pe.edu.upc.clothingfashion.repositories.ISuscriptionRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISuscriptionService;

import java.util.List;

@Service
public class SuscriptionServiceImplement implements ISuscriptionService {
    @Autowired
    private ISuscriptionRepository sR;

    @Override
    public void insert(Suscription suscription) {
        sR.save(suscription);
    }

    @Override
    public void delete(int idSuscription) {
        sR.deleteById(idSuscription);
    }
    @Override
    public List<String[]> getCountUserIdByPaymentDate() {
        return sR.UserDate();
    }
    @Override
    public List<Suscription> list() {
        return sR.findAll();
    }

    @Override
    public Suscription listId(int idSuscription) {
        return sR.findById(idSuscription).orElse(new Suscription());
    }
}
