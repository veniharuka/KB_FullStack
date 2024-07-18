package org.scoula.user2;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.user2.UserVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final Connection conn;

    public UserDAO() {
        this.conn = JDBCUtil.getConnection();
    }

    public void addUser(UserVO user) {
        String sql = "INSERT INTO user_table (userid, name, password, age, membership) VALUES (?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserid());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());
            pstmt.setInt(4, user.getAge());
            pstmt.setBoolean(5, user.isMembership());
            pstmt.executeUpdate();

            System.out.println("회원 추가 성공!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<UserVO> getAllUsers() {
        String sql = "SELECT * FROM user_table";
        List<UserVO> users = new ArrayList<>();

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                UserVO user =new UserVO(
                        rs.getInt("id"),
                        rs.getString("userid"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getInt("age"),
                        rs.getBoolean("membership"),
                        rs.getTimestamp("signup_date"));

                users.add(user);

            }

            users.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("데이터베이스 연결이 성공적으로 종료되었습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
