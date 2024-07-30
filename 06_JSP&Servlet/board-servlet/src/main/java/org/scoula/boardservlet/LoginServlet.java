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
    private static Connection con =null;

    @Override
    public void init() throws ServletException {
        System.out.println("##### login servlet init 메서드 호출 #####");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

            System.out.println("##### MySQL 연결 성공 #####");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

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

            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

            try(PreparedStatement ps = con.prepareStatement(sql)){

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
            HttpSession session = request.getSession();
            session.setAttribute("username",username);

            response.sendRedirect("/board");
        }else{
            response.sendRedirect("loginFailed.jsp");
        }
    }

    @Override
    public void destroy() {
        try {
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("##### LoginServlet destroy 호출 #####");
    }
}