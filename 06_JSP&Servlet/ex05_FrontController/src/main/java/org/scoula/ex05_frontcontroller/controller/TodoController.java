package org.scoula.ex05_frontcontroller.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static sun.jvm.hotspot.code.CompressedStream.L;

public class TodoController {
    public String getList(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<String> list = Arrays.asList("Todo 1","Todo 2","Todo 3");
        request.setAttribute("todoList", list);
        System.out.println("Get/todo/list");
        return "todo/list";
    }
    public String getView(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get/todo/view");
        return "todo/view";
    }
    public String getCreate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get/todo/create");
        return "todo/create";
    }

    public String postCreate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post/todo/create");
        return "redirect:/todo/create";
    }
    public String getUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get/todo/update");
        return "todo/update";
    }
    public String postUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post/todo/update");
        return "redirect:/todo/update";
    }
    public String postDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post/todo/delete");
        return "redirect:/todo/delete";
    }
}
