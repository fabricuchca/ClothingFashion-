package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.EventDTO;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.serviceinterfaces.IEventService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private IEventService eS;
    @PostMapping
    public void registrar(@RequestBody EventDTO dto){
        ModelMapper m=new ModelMapper();
        Event e=m.map(dto, Event.class);
        eS.insert(e);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public EventDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        EventDTO dto=m.map(eS.listId(id),EventDTO.class);
        return dto;
    }
    @GetMapping
    public List<EventDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EventDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody EventDTO dto) {
        ModelMapper m = new ModelMapper();
        Event a=m.map(dto,Event.class);
        eS.insert(a);
    }
}
