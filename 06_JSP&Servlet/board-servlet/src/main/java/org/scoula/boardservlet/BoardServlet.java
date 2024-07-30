package org.scoula.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1384";
    private static Connection con =null;

    @Override
    public void init() throws ServletException {
        System.out.println("##### Boardservlet init 메서드 호출 #####");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

            String sql = "select * from board";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("content"));
            }

            System.out.println("##### MySQL 연결 성공 #####");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("board.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String post = request.getParameter("post");
        request.setAttribute("post",post);
        RequestDispatcher dispatcher = request.getRequestDispatcher("boardDetail.jsp");
        dispatcher.forward(request,response);



    }

    @Override
    public void destroy() {
        try{
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("##### Boardservlet destroy 호출 #####");
    }
}