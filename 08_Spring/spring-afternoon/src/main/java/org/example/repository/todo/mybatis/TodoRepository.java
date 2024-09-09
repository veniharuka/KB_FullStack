package org.example.repository.todo.mybatis;

import org.example.domain.TodoMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    private final TodoMapper todoMapper;

    @Autowired
    public TodoRepository(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }
    public List<TodoMybatis> findAll(){
        return todoMapper.findAll();
    }

    public TodoMybatis findById(Long id){
        return todoMapper.findById(id);
    }

    public int save(TodoMybatis newTodo){
        return todoMapper.save(newTodo);
    }

    public int delete(Long id){
        return todoMapper.delete(id);
    }
    public int updateDone(TodoMybatis newTodo){
        return todoMapper.updateDone(newTodo);
    }
    public int updateContent(TodoMybatis newTodo){
        return todoMapper.updateContent(newTodo);
    }
    public int updateAge(TodoMybatis newTodo){
        return todoMapper.updateContent(newTodo);
    }
}
