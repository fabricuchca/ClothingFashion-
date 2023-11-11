package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.RecommendationsDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Recommendations;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRecommendationsService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recommendations")
public class RecommendationsController {
    @Autowired
    private IRecommendationsService rS;

    @PostMapping
    public void registrar(@RequestBody RecommendationsDTO dto){
        ModelMapper m=new ModelMapper();
        Recommendations r=m.map(dto, Recommendations.class);
        rS.insert(r);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RecommendationsDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        RecommendationsDTO dto=m.map(rS.listId(id),RecommendationsDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RecommendationsDTO dto) {
        ModelMapper m = new ModelMapper();
        Recommendations r=m.map(dto,Recommendations.class);
        rS.insert(r);
    }
    @PostMapping("/buscar")
    public List<RecommendationsDTO> buscar(@RequestParam String categoryTag){

        return rS.findByCategoryTag(categoryTag).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecommendationsDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping
    public List<RecommendationsDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RecommendationsDTO.class);
        }).collect(Collectors.toList());
    }
}
