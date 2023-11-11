package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.ClothingDTO;
import pe.edu.upc.clothingfashion.entities.Clothing;
import pe.edu.upc.clothingfashion.serviceinterfaces.IClothingService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clothings")
public class ClothingController {
    @Autowired
    private IClothingService clS;
    @PostMapping
    public void registrar(@RequestBody ClothingDTO dto){
        ModelMapper m=new ModelMapper();
        Clothing cl=m.map(dto, Clothing.class);
        clS.insert(cl);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        clS.delete(id);
    }
    @GetMapping
    public List<ClothingDTO> listar(){

        return clS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody ClothingDTO dto) {
        ModelMapper m = new ModelMapper();
        Clothing cl=m.map(dto,Clothing.class);
        clS.insert(cl);
    }
    @PostMapping("/buscarColor")
    public List<ClothingDTO> buscarColor(@RequestParam int color){

        return clS.findByColor(color).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarTemporada")
    public List<ClothingDTO> buscarTemporada(@RequestParam int season){

        return clS.findBySeason(season).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarTextura")
    public List<ClothingDTO> buscarTextura(@RequestParam int texture){

        return clS.findByTexture(texture).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarMarca")
    public List<ClothingDTO> buscarMarca(@RequestParam int brand){

        return clS.findByBrand(brand).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarEvento")
    public List<ClothingDTO> buscarEvento(@RequestParam int event){

        return clS.findByEvent(event).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClothingDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ClothingDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ClothingDTO dto=m.map(clS.listId(id),ClothingDTO.class);
        return dto;
    }
}
