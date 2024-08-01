package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutContoller implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "컨트롤러가 전달한 메시지 입니다");
        request.setAttribute("imgSrc", "https://images.ddengle.com/files/attach/images/11334861/316/966/013/c298b705f66697be0c854969c223fd95.jpg");
        return "about";
    }
}
