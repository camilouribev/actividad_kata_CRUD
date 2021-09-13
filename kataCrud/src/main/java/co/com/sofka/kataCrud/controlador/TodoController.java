package co.com.sofka.kataCrud.controlador;
import co.com.sofka.kataCrud.entidades.Todo;
import co.com.sofka.kataCrud.servicios.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin( origins = "http://localhost:3000")
@RequestMapping("api")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "/todos")
    public Iterable<Todo> list(){
        return service.list();
    }
    @PostMapping(value = "/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }
    @PutMapping(value = "{id}/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null){
            return service.save(todo);}
        throw new RuntimeException("No existe el id para actualizar");
    }
    @DeleteMapping(value = "/{id}/todo")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @RequestMapping(value = "/{id}/todo")
    public Todo get(@PathVariable Long id){
        return service.get(id);
    }
}
