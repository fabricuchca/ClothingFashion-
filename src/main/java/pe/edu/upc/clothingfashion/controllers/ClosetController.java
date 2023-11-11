package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.serviceinterfaces.IClosetService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/closets")
public class  ClosetController {
    @Autowired
    private IClosetService aS;

    @PostMapping
    public void registrar(@RequestBody ClosetDTO dto){
        ModelMapper m=new ModelMapper();
        Closet a=m.map(dto, Closet.class);
        aS.insert(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public ClosetDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ClosetDTO dto=m.map(aS.listId(id),ClosetDTO.class);
        return dto;
    }
    @GetMapping
    public List<ClosetDTO> listar(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClosetDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody ClosetDTO dto) {
        ModelMapper m = new ModelMapper();
        Closet a=m.map(dto,Closet.class);
        aS.insert(a);
    }
    @PostMapping("/buscar")
    public List<ClosetDTO> buscar(@RequestParam String styleCloset){

        return aS.findBystyleCloset(styleCloset).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClosetDTO.class);
        }).collect(Collectors.toList());
    }

}
