package pe.edu.upc.clothingfashion.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.TypeClothingDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Type_Clothing;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITypeClothingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeClothings")
public class TypeClothingController {
    @Autowired
    private ITypeClothingService tpS;

    @PostMapping
    public void registrar(@RequestBody TypeClothingDTO dto){
        ModelMapper m=new ModelMapper();
        Type_Clothing tp=m.map(dto,Type_Clothing.class);
        tpS.insert(tp);
    }
    @GetMapping
    public List<TypeClothingDTO>listar(){
        return tpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TypeClothingDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tpS.delete(id);}
    @GetMapping("/{id}")
    public TypeClothingDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TypeClothingDTO dto=m.map(tpS.listId(id),TypeClothingDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody TypeClothingDTO dto) {
        ModelMapper m = new ModelMapper();
        Type_Clothing a=m.map(dto,Type_Clothing.class);
        tpS.insert(a);
    }
}
