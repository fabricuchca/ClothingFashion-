package pe.edu.upc.clothingfashion.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand,Integer> {
}
