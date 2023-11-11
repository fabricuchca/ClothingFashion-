package pe.edu.upc.clothingfashion.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Clothing;

import java.util.List;
@Repository
public interface IClothingRepository extends JpaRepository<Clothing, Integer> {
    //BUSCAR POR TEMPORADA
    @Query("SELECT s.nameSeason,c.nameTypeClothing\n" +
            "FROM Season s \n" +
            "INNER JOIN Type_Clothing c ON s.idSeason= c.idTypeClothing")


    List<Clothing>findByNameSeasonAndNameTypeClothing(String nameSeason,String nameTypeClothing);
    List<Clothing> findByColor(int color);
    List<Clothing> findBySeason(int season);
    List<Clothing> findByTexture(int texture);
    List<Clothing> findByBrand(int brand);
    List<Clothing> findByEvent(int event);

}
