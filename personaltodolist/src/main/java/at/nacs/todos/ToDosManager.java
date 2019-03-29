package at.nacs.todos;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDosManager {

    private final TodosRepository todosRepository;


    public List<ToDo> findAll() {
        return todosRepository.findAll();
    }

    public Optional<ToDo> findById(String id) {
        return todosRepository.findById(id);
    }

    //save mark as done delete delete all

    public Optional<ToDo> markAsDone(String id) {
        Optional<ToDo> toBedoneTodo = todosRepository.findById(id);
        if (toBedoneTodo.isEmpty()) {
            return Optional.empty();
        }

        ToDo doneTodo = toBedoneTodo.get();
        doneTodo.setDone(true);
        return Optional.of(doneTodo);
    }

    public void delete(String id) {
        todosRepository.deleteById(id);
    }


    public void deleteAll() {
        todosRepository.deleteAll();
    }

    public ToDo save(ToDo toDo) {
        return todosRepository.save(toDo);
    }
}
