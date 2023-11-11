package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.CommentsDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICommentservice;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private ICommentservice comS;

    @PostMapping
    public void registrar(@RequestBody CommentsDTO dto){
        ModelMapper m=new ModelMapper();
        Comments com=m.map(dto, Comments.class);
        comS.insert(com);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        comS.delete(id);
    }
    @GetMapping("/{id}")
    public CommentsDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        CommentsDTO dto=m.map(comS.listId(id),CommentsDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CommentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Comments com=m.map(dto,Comments.class);
        comS.insert(com);
    }
    @PostMapping("/buscar")
    public List<CommentsDTO> buscar(@RequestParam LocalDate dateComment){

        return comS.findByDateComment(dateComment).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CommentsDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping
    public List<CommentsDTO> listar(){
        return comS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CommentsDTO.class);
        }).collect(Collectors.toList());
    }
}
