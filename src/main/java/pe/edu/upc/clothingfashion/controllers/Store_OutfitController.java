package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.Store_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Store_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.IStore_OutfitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/storeOutfits")
public class Store_OutfitController {
    @Autowired
    private IStore_OutfitService toS;
    @PostMapping
    public void registrar(@RequestBody Store_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Store_Outfit to=m.map(dto,Store_Outfit.class);
        toS.insert(to);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        toS.delete(id);
    }
    @GetMapping("/{id}")
    public Store_OutfitDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        Store_OutfitDTO dto=m.map(toS.listId(id),Store_OutfitDTO.class);
        return dto;
    }
    @GetMapping
    public List<Store_OutfitDTO> listar(){
        return toS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Store_OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody Store_OutfitDTO dto) {
        ModelMapper m = new ModelMapper();
        Store_Outfit a=m.map(dto,Store_Outfit.class);
        toS.insert(a);
    }
}
