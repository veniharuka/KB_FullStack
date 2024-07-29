package org.scoula.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1384";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp"); //login 파일을 갖다 줌.
        dispatcher.forward(request, response);// 물건 만들고 포장하는 사람에게 전달한다.
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isLoginSuccess = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

            try(Connection con  = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
                PreparedStatement ps =con.prepareStatement(sql)){
                ps.setString(1,username);
                ps.setString(2,password);

                try(ResultSet rs = ps.executeQuery()) {
                    if(rs.next()){
                        isLoginSuccess = true;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        if(isLoginSuccess){
            request.setAttribute("username",username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request,response);
        }else{
            response.sendRedirect("loginFailed.jsp");
        }
    }
}