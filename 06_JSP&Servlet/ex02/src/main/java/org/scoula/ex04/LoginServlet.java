package org.scoula.ex04;

import org.scoula.ex04.dto.LoginDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String userid = request.getParameter("userid");
       String passwd = request.getParameter("passwd");

       LoginDTO loginDTO = new LoginDTO(userid, passwd);
       request.setAttribute("userid", userid);
       request.setAttribute("passwd", passwd);

       request.setAttribute("loginDTO", loginDTO);
       request.getRequestDispatcher("login.jsp").forward(request, response);

        response.setContentType("text/html;charset=utf-8");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}