package at.nacs.todos;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/todos")
@RestController
@RequiredArgsConstructor
public class ToDosEndpoint {

    private ToDosManager toDosManager;


    @GetMapping
    List<ToDo> get() {
        return toDosManager.findAll();
    }

    @GetMapping("/{id}")
    ToDo get(String id) {
        return toDosManager.findById(id).orElse(null);
    }

    @PostMapping
    ToDo post(@RequestBody ToDo toDo) {
        return toDosManager.save(toDo);
    }

    @PutMapping("/{id}/done")
    ToDo put(String id) {
        return toDosManager.markAsDone(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    void delete(String id) {
        toDosManager.delete(id);
    }


}
//