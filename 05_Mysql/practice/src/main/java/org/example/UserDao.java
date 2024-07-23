package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    static Connection conn = null;
    static{

        String driver
                Class.forName(driver);
        conn = DriverManager.getConnection(url,id,password);
        if(conn !== null){
            System.out.println("DB 접속 성공");
        }

        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void close(){
        try{
            if(conn != null){
                conn.close();
                conn = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void create(String email,String password){
        String sql = "INSERT INTO user VALUES(?,?)";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,email);
            ps.setString(2,password);

            int affectedRows = ps.executeUpdate();
            if(affectedRows > 0){
                System.out.println("회원 만들기 성공");
            }else{
                System.out.println("회원 추가 실패");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getAllUsers(){
        String sql = "SELECT * FROM user";
        List<UserVo> userlist = new ArrayList<>();
        try(Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql)){
            while(rs.next()){
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");

                UserVo user = new UserVo(id, email, password);
                userlist.add(user);
            }

            userlist.forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateUser(int id,String email,String password){
        String sql = "UPDATE user SET email=?,password=? WHERE id=?";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.setString(2,email);
            ps.setString(3,password);


            int affectedRows = ps.executeUpdate();
            if(affectedRows > 0){
                System.out.println("수정 성공");
            }else{
                System.out.println("수정 실패");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteUser(int id){
        String sql = "DELETE FROM user WHERE id=?";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            int affectedRows = ps.executeUpdate();
            if(affectedRows > 0){
                System.out.println("삭제 성공");
            }else{
                System.out.println("삭제 실패");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getAllUsersWithName() {
        String sql= "SELECT user.id, user.email,user.password,user_info.name"+
                "FROM user"+
                "JOIN user_info  ON user.id=user_info.id ";

        try(Statement st = conn.createStatement(sql)){
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String name = rs.getString("name");

                System.out.printf("ID: %d, email: %s, password: %s%n", id, email, password);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
