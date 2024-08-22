package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.TodoMybatis;
import org.example.repository.todo.mybatis.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(value = "/todo")
public class MybatisTodoController {
    private final TodoRepository todoRepository;

    @GetMapping("")
    public ResponseEntity<List<TodoMybatis>> findAll() {
        List<TodoMybatis> todoList = todoRepository.findAll();
        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoMybatis> findById(@PathVariable Long id) {
        TodoMybatis findTodo = todoRepository.findById(id);

        if(findTodo == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(findTodo);
    }

    @PostMapping("/{todo}")
    public ResponseEntity<TodoMybatis> save(
            @PathVariable("todo") String todo

    ){
        TodoMybatis newTodo = new TodoMybatis(null, todo,false );
        int affectedRows = todoRepository.save(newTodo);

        if(affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else{
            return ResponseEntity.ok(newTodo);
        }
    }

    @DeleteMapping(value = "/{id}" , produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        int affectedRows = todoRepository.delete(id);

        if(affectedRows == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo 삭제 실패");
        return ResponseEntity.ok("Todo 삭제 성공");
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoMybatis> updateDone(
            @PathVariable("id") Long id

    ){
        TodoMybatis findTodo = todoRepository.findById(id);

        boolean trueOrfalse = findTodo.getDone();
        findTodo.setDone(!trueOrfalse);
        todoRepository.updateDone(findTodo);
        return ResponseEntity.ok(findTodo);
    }
    @PutMapping("/update/{id}/{todo}")
    public ResponseEntity<TodoMybatis> updateContent(
            @PathVariable("id") Long id,
            @PathVariable("todo") String todo
    ){
        TodoMybatis findTodo = todoRepository.findById(id);
        findTodo.setTodo(todo);

        todoRepository.updateContent(findTodo);
        return ResponseEntity.ok(findTodo);
    }

}
