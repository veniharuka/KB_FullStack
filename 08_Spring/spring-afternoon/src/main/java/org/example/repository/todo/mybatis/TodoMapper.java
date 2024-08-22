package org.example.repository.todo.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.TodoMybatis;

import java.util.List;

@Mapper
public interface TodoMapper {
    public List<TodoMybatis> findAll();
    public TodoMybatis findById(@Param("id") Long id);
    public int save(TodoMybatis newTodo);
    public int delete(@Param("id") Long id);
    public int updateDone(TodoMybatis newTodo);
    public int updateContent(TodoMybatis newTodo);
}
