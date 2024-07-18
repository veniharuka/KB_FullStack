package org.scoula.user;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class ManageUser {
    public void addUser(User user){
        Connection conn = JDBCUtil.getConnection();
        String sql = "INSERT INTO user_table (userid, name, password, age, membership) VALUES (?,?,?,?,?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,user.getUserid());
            pstmt.setString(2,user.getName());
            pstmt.setString(3,user.getPassword());
            pstmt.setInt(4,user.getAge());
            pstmt.setBoolean(5,user.isMembership());
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
        // table을 그냥 가져오기만 해서 데이터가 자주 변하지 않으니깐
        // pstmt 방식을 쓸 필요가 없음. 그냥 고정해 놓고 보면 된다.
    public void getAllUsers(){
        Connection conn = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user_table";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            ArrayList<User> users = new ArrayList<User>();

            while(rs.next()){
                int id = rs.getInt("id");
                String userid = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membership");
                Timestamp signup = rs.getTimestamp("signup_date");

                User user =new User(id,userid,name,password,age,membership,signup);

                users.add(user);
            }
            users.forEach((user)-> System.out.println(user));
            // users.forEach(system.out::println);


        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }


    public void deleteUserById(int id){
        Connection conn = JDBCUtil.getConnection();
        String sql = "DELETE FROM user_table WHERE id = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows == 0){
                System.out.print("ID가 "+id+"인 회원이 존재하지 않습니다.");
            }else {
                System.out.print("ID가 "+id+"인 회원 정보가 성공적으로 제거되었습니다.");
            }
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
