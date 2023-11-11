package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.UsersDTO;
import pe.edu.upc.clothingfashion.dtos.UsersClaseDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Users;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsersService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService uS;
    @PostMapping
    public void registrar(@RequestBody UsersDTO dto){
        ModelMapper m=new ModelMapper();
        Users u=m.map(dto, Users.class);
        uS.insert(u);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void eliminar(@PathVariable("id") Long id)
    {
        uS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public UsersDTO listarId(@PathVariable("id")Long id){
        ModelMapper m=new ModelMapper();
        UsersDTO dto=m.map(uS.listId(id),UsersDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void modificar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u=m.map(dto,Users.class);
        uS.insert(u);
    }
    @PostMapping("/buscar")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<UsersDTO> buscar(@RequestParam String nameUser, String lastNameUser){

        return uS.findByNameUserAndLastNameUser(nameUser, lastNameUser).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/armarios")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<UsersClaseDTO> getUsuariomasArmarios() {
        List<String[]> countClosetByUser = uS.getCountClosetByUser();
        List<UsersClaseDTO> closetUsersDTOList = new ArrayList<>();

        for (String[] data : countClosetByUser) {
            if (data.length >= 2) {
                UsersClaseDTO usersClaseDTO = new UsersClaseDTO();
                usersClaseDTO.setNameUsers(data[0]);
                usersClaseDTO.setQuantityCloset(Integer.parseInt(data[1]));
                closetUsersDTOList.add(usersClaseDTO);
            }
        }

        return closetUsersDTOList;
    }
    @GetMapping
    public List<UsersDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }
}
