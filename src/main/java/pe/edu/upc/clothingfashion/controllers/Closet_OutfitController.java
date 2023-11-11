package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.Closet_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICloset_OutfitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/closetOutfits")
public class Closet_OutfitController {
    @Autowired
    private ICloset_OutfitService cuS;
    @PostMapping
    public void registrar(@RequestBody Closet_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Closet_Outfit cu=m.map(dto, Closet_Outfit.class);
        cuS.insert(cu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cuS.delete(id);
    }
    @GetMapping
    public List<Closet_OutfitDTO> listar(){
        return cuS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Closet_OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public Closet_OutfitDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        Closet_OutfitDTO dto=m.map(cuS.listId(id),Closet_OutfitDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Closet_OutfitDTO dto) {
        ModelMapper m = new ModelMapper();
        Closet_Outfit a=m.map(dto,Closet_Outfit.class);
        cuS.insert(a);
    }
}
