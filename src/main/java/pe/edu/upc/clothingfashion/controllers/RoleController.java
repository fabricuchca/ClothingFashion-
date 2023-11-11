package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.RoleDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Role;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;
    @PostMapping
    public void registrar(@RequestBody RoleDTO dto){
        ModelMapper m=new ModelMapper();
        Role r=m.map(dto, Role.class);
        rS.insert(r);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void eliminar(@PathVariable("id") Long id)
    {
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RoleDTO listarId(@PathVariable("id")Long id){
        ModelMapper m=new ModelMapper();
        RoleDTO dto=m.map(rS.listId(id),RoleDTO.class);
        return dto;
    }
    @GetMapping
    public List<RoleDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role a=m.map(dto,Role.class);
        rS.insert(a);
    }
}
