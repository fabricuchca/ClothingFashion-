package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.SeasonDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Season;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISeasonService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/seasons")
public class SeasonController {
        @Autowired
        private ISeasonService temS;
        @PostMapping
        public void registrar(@RequestBody SeasonDTO dto){
            ModelMapper m=new ModelMapper();
            Season tem=m.map(dto, Season.class);
            temS.insert(tem);
        }
        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id") Integer id)
        {
            temS.delete(id);
        }
    @GetMapping("/{id}")
    public SeasonDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        SeasonDTO dto=m.map(temS.listId(id),SeasonDTO.class);
        return dto;
    }
    @GetMapping
    public List<SeasonDTO> listar(){
        return temS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SeasonDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody SeasonDTO dto) {
        ModelMapper m = new ModelMapper();
        Season a=m.map(dto,Season.class);
        temS.insert(a);
    }
}
