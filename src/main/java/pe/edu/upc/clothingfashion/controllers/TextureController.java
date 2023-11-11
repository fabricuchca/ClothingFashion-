package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.TextureDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Texture;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITextureService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/textures")
public class TextureController {
    @Autowired
    private ITextureService tS;
    @PostMapping
    public void registrar(@RequestBody TextureDTO dto){
        ModelMapper m=new ModelMapper();
        Texture t=m.map(dto,Texture.class);
        tS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TextureDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TextureDTO dto=m.map(tS.listId(id),TextureDTO.class);
        return dto;
    }
    @GetMapping
    public List<TextureDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TextureDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody TextureDTO dto) {
        ModelMapper m = new ModelMapper();
        Texture a=m.map(dto,Texture.class);
        tS.insert(a);
    }
}
