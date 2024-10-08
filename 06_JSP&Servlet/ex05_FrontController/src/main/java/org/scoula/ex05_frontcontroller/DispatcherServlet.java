package org.scoula.ex05_frontcontroller;

import org.scoula.ex05_frontcontroller.command.Command;
import org.scoula.ex05_frontcontroller.controller.HomeController;
import org.scoula.ex05_frontcontroller.controller.TodoController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DispatcherServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix ="/WEB-INF/views/";
    String suffix = ".jsp";


    public void init(){
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        createMap(getMap,postMap);
    }
    protected void createMap(Map<String, Command> getMap, Map<String, Command> postMap){

    }

    private  String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);

        Command command;
        if(request.getMethod().equalsIgnoreCase("GET")){
            command = getMap.get(commandName);
        }else {
            command = postMap.get(commandName);
        }
        return command;
    }

    public void execute(Command command, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewName = command.execute(request,response);
        if(viewName.startsWith("redirect:")){
            response.sendRedirect(viewName.substring("redirect:".length()));
        }else {
            String view = prefix + viewName + suffix;
            System.out.println(view);
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Command command = getCommand(request);
        if(command != null){
            execute(command,request, response);
        }else{
            String view = prefix + "404"+ suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}