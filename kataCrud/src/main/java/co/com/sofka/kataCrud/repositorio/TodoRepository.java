package co.com.sofka.kataCrud.repositorio;
import co.com.sofka.kataCrud.entidades.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
