package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Todo;
import org.example.repository.todo.jpa.JpaTodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@Transactional
@RequestMapping("/todo/jpa")
public class JpaTodoController {
    private final JpaTodoRepository jpaTodoRepository;

    @GetMapping("")
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> todoList = jpaTodoRepository.findAll();
        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo findtodo = jpaTodoRepository.findById(id);

        if(findtodo == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(findtodo);
    }
    @PostMapping("/{todo}")
    public ResponseEntity<Todo> save(
            @PathVariable("todo") String todo

            ) {
        Todo newtodo = new Todo(null, todo, false);
        Todo addedTodo = jpaTodoRepository.save(newtodo);

        if(addedTodo == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else{
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

    }
    @DeleteMapping(value = "/{id}" , produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);

        if(findTodo == null) return ResponseEntity.notFound().build();

        jpaTodoRepository.delete(findTodo.getId());
        return ResponseEntity.ok("삭제 성공");
    }
}
