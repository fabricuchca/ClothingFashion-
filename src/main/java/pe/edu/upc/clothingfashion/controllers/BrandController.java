package pe.edu.upc.clothingfashion.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.BrandDTO;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.serviceinterfaces.IBrandService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private IBrandService mS;

    @PostMapping
    public void registrar(@RequestBody BrandDTO dto){
        ModelMapper m=new ModelMapper();
        Brand ma=m.map(dto,Brand.class);
        mS.insert(ma);
    }
    @GetMapping
    public List<BrandDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,BrandDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public BrandDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        BrandDTO dto=m.map(mS.listId(id),BrandDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody BrandDTO dto) {
        ModelMapper m = new ModelMapper();
        Brand a=m.map(dto,Brand.class);
        mS.insert(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){mS.delete(id);}


}
