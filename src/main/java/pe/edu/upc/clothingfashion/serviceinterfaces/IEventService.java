package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Event;

import java.util.List;

public interface IEventService {
    public void insert(Event event);
    public void delete(int idEvent);
    public Event listId(int idEvent);
    public List<Event> list();
}
