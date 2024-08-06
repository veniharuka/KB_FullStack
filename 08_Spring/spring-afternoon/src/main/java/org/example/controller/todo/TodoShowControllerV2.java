package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV1;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    private TodoDtoListV2 todoList;

    @Autowired
    public TodoShowControllerV2(TodoDtoListV2 todoDtoList) {
        this.todoList = todoDtoList;
    }

    @GetMapping("/todo/v2/show")
    public String todoShow(HttpServletRequest request, HttpServletResponse response){
        log.info("===========> 할 일 목록 조회 페이지 호출, /todo/show");

        request.setAttribute("todoList", todoList.getList());
        return "todo-show2";

    }
}
