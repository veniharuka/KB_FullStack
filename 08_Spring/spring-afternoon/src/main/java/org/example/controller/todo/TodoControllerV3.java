package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV2;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequestMapping("/todo/v3")
public class TodoControllerV3 {
    private TodoDtoListV2 todoList;

    @Autowired
    public TodoControllerV3(TodoDtoListV2 todoDtoList) {
        this.todoList = todoDtoList;
    }
    @GetMapping("/form")
    public String todoForm(HttpServletRequest request, HttpServletResponse response){
        log.info("===========> 할 일  추가 페이지 호출,/todo/form");
        return "todo-form3";
    }
    @PostMapping(value = "/form/save")
    public String todoSave(Model model,
                           @RequestParam("todo") String todo)
            {
        log.info("===========> 할 일 추가 Request 호출, /todo/form/save");


        todoList.addList(todo);
        model.addAttribute("todoList", todoList.getList());

        return "todo-show2";
    }
    @GetMapping("/show")
    public String todoShow(HttpServletRequest request, Model model){
        log.info("===========> 할 일 목록 조회 페이지 호출, /todo/show");

        model.addAttribute("todoList", todoList.getList());
        return "todo-show3";

    }


}
