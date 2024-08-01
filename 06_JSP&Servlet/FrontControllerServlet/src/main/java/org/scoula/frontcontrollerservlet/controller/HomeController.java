package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://images.ddengle.com/files/attach/images/11334861/316/966/013/c298b705f66697be0c854969c223fd95.jpg");
        return "index";
    }
}
