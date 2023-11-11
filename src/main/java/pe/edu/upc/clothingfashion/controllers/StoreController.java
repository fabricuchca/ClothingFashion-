package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.ClothingDTO;
import pe.edu.upc.clothingfashion.dtos.SeasonDTO;
import pe.edu.upc.clothingfashion.dtos.StoreDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Store;
import pe.edu.upc.clothingfashion.serviceinterfaces.IStoreService;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/stores")
public class StoreController {
    @Autowired
    private IStoreService tiS;

    @PostMapping
    public void registrar(@RequestBody StoreDTO dto){
        ModelMapper m=new ModelMapper();
        Store t=m.map(dto, Store.class);
        tiS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tiS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody StoreDTO dto) {
        ModelMapper m = new ModelMapper();
        Store t=m.map(dto, Store.class);
        tiS.insert(t);
    }
    @GetMapping
    public List<StoreDTO> listar(){

        return tiS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,StoreDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public StoreDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        StoreDTO dto=m.map(tiS.listId(id),StoreDTO.class);
        return dto;
    }
}
