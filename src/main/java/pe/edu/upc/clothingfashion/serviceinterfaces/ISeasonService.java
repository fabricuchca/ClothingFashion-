package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Season;

import java.util.List;

public interface ISeasonService {
    public void insert(Season season);
    public void delete(int idSeason);
    public Season listId(int idSeason);
    public List<Season> list();
}
