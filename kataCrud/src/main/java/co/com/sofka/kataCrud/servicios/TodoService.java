package co.com.sofka.kataCrud.servicios;
import co.com.sofka.kataCrud.entidades.Todo;
import co.com.sofka.kataCrud.repositorio.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }
    public Todo get(Long id){
        return repository.findById(id).orElseThrow();
    }

}