package org.scoula.ex05_frontcontroller;

import com.sun.tools.javac.comp.Todo;
import org.scoula.ex05_frontcontroller.command.Command;
import org.scoula.ex05_frontcontroller.controller.HomeController;
import org.scoula.ex05_frontcontroller.controller.TodoController;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="frontControllerServlet", value = "/")
public class FrontControllerServlet extends DispatcherServlet {


    HomeController homeController = new HomeController();
    TodoController todoController = new TodoController();

    @Override
    protected void createMap(Map<String,Command> getMap,Map<String,Command> postMap) {
        getMap.put("/", homeController::getIndex);

        getMap.put("/todo/list", todoController::getList);
        getMap.put("/todo/view", todoController::getView);
        getMap.put("/todo/create", todoController::getCreate);
        getMap.put("/todo/update", todoController::getUpdate);

        getMap.put("/todo/create", todoController::postCreate);
        getMap.put("/todo/update", todoController::postUpdate);
        getMap.put("/todo/delete", todoController::postDelete);

    }

}