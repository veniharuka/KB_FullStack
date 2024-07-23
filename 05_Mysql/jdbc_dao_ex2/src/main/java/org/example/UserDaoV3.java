package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoV3 {
    static Connection conn = null;
    static{
        try{
            //1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK.");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1384";
            conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");


        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public void addUser(UserVo newUser) {

        try {


            //3.SQL문 생성
            String sql = "INSERT INTO users(email,password) VALUES(?,?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newUser.getEmail());
            ps.setString(2, newUser.getPassword());
            System.out.println("3. SQL문 생성 OK");

            //4. SQL문 전송 및 실행

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 추가 성공");
            } else {
                System.out.println("회원 추가 실패");
            }

            // 5. 자원 해제
            ps.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<UserVo> getAllUsers(int id) {

            List<UserVo> userList = new ArrayList<>();
        try {


            // 3. SQL 문 생성
            String sql= "SELECT id, email, password FROM users where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("3. SQL문 생성 OK");
            //4. SQL문 전송
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                int userid = rs.getInt("id");
                String userEmail = rs.getString("email");
                String userpassword  = rs.getString("password");

                UserVo user = new UserVo(userid,userEmail,userpassword);
                userList.add(user);


            }
            // 5. 자원 해체
            rs.close();
            ps.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void updateUser(int userid, String newEmail, String newPassword){
        try{


            String sql = "UPDATE SET email=?, password=?, WHERE id =?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,newEmail);
            ps.setString(2,newPassword);
            ps.setInt(3,userid);

            int affectedRows = ps.executeUpdate();
            if(affectedRows >0){
                System.out.println("수정 성공");
            }else{
                System.out.println("수정 실패");
            }

            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteUser(int userid){
        try{


            String sql = "DELETE FROM users WHERE id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,userid);
            int affectedRows = ps.executeUpdate();
            if(affectedRows >0){
                System.out.println("삭제 성공");
            }else {
                System.out.println("삭제 실패");
            }
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
