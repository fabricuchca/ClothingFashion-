package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.CatalogDTO;
import pe.edu.upc.clothingfashion.dtos.CatalogRecommendationsDTO;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    @Autowired
    private ICatalogService catS;
    @PostMapping
    public void registrar(@RequestBody CatalogDTO dto){
        ModelMapper m=new ModelMapper();
        Catalog cat=m.map(dto,Catalog.class);
        catS.insert(cat);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        catS.delete(id);
    }
    @GetMapping("/maxcatalog")
    public List<CatalogRecommendationsDTO> getRecommendationsByCatalog() {
        List<String[]> countCatalogRecommendations = catS.getCountCatalogRecommendations();
        List<CatalogRecommendationsDTO> catalogRecommendationsDTOList = new ArrayList<>();

        for (String[] data : countCatalogRecommendations) {
            if (data.length >= 2) {
                CatalogRecommendationsDTO catalogRecommendationsDTO = new CatalogRecommendationsDTO();
                catalogRecommendationsDTO.setId_catalog(Integer.parseInt(data[1]));
                catalogRecommendationsDTO.setId_recommendations(Integer.parseInt(data[1]));
                catalogRecommendationsDTO.setRecommendation_title(data[0]);
                catalogRecommendationsDTO.setCalification(Integer.parseInt(data[1]));

                catalogRecommendationsDTOList.add(catalogRecommendationsDTO);
            }
        }

        return catalogRecommendationsDTOList;
    }
    @GetMapping
    public List<CatalogDTO> listar(){
        return catS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CatalogDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public CatalogDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        CatalogDTO dto=m.map(catS.listId(id),CatalogDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CatalogDTO dto) {
        ModelMapper m = new ModelMapper();
        Catalog a=m.map(dto,Catalog.class);
        catS.insert(a);
    }
}
