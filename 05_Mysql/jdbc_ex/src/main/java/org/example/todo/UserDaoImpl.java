package org.example.todo;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;


public class UserDaoImpl implements UserDao {
    private final Connection conn;


    public UserDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVo loginUser(String user_Id,String password) {
        String sql ="SELECT * FROM todo_user WHERE user_id=? AND password=?";
        UserVo loginUser=null;

        try(PreparedStatement psmt = conn.prepareStatement(sql)){
            psmt.setString(1, user_Id);
            psmt.setString(2, password);
            try (ResultSet rs = psmt.executeQuery()){
                while(rs.next()){
                    String loginUserID=rs.getString("user_id");
                    String loginName=rs.getString("name");
                    String loginPassword = rs.getString("password");
                    Timestamp loginCreatedAt= rs.getTimestamp("created_at");

                    loginUser =new UserVo(loginUserID,loginName,loginPassword,loginCreatedAt);
                }
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return loginUser;
    }
}
