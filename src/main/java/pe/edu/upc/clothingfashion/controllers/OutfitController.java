package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.IOutfirService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/outfits")
public class OutfitController {
    @Autowired
    private IOutfirService oS;

    @PostMapping
    public void registrar(@RequestBody OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Outfit o=m.map(dto, Outfit.class);
        oS.insert(o);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        oS.delete(id);
    }
    @GetMapping("/{id}")
    public OutfitDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        OutfitDTO dto=m.map(oS.listId(id),OutfitDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody OutfitDTO dto) {
        ModelMapper m = new ModelMapper();
        Outfit o=m.map(dto,Outfit.class);
        oS.insert(o);
    }
    @PostMapping("/buscar")
    public List<OutfitDTO> buscar(@RequestParam String styleOutfit){

        return oS.findBystyleOutfit(styleOutfit).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping
    public List<OutfitDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OutfitDTO.class);
        }).collect(Collectors.toList());
    }
}
