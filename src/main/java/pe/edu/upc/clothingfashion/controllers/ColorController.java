package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.ColorDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Color;
import pe.edu.upc.clothingfashion.serviceinterfaces.IColorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/colors")
public class ColorController {
    @Autowired
    private IColorService cS;
    @PostMapping
    public void registrar(@RequestBody ColorDTO dto){
        ModelMapper m=new ModelMapper();
        Color c=m.map(dto,Color.class);
        cS.insert(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ColorDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ColorDTO dto=m.map(cS.listId(id),ColorDTO.class);
        return dto;
    }
    @GetMapping
    public List<ColorDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ColorDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody ColorDTO dto) {
        ModelMapper m = new ModelMapper();
        Color a=m.map(dto,Color.class);
        cS.insert(a);
    }
}
