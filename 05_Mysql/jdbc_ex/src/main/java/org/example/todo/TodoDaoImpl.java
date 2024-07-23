package org.example.todo;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.user2.UserVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoDaoImpl implements TodoDao {

    private final Connection conn;

    public TodoDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public int getTotalCount(String user_id) {
        String sql = "SELECT count(*) FROM todo where user_id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) return rs.getInt(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return 0;
    }

    @Override
    public void getTodosByUserId(String user_id) {
        String sql = "SELECT * FROM todo WHERE user_id=?";
        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, user_id);
            ArrayList<Todovo> todos = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo= rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    Todovo todoData = new Todovo(id,userId,todo,is_completed,created_at);
                    todos.add(todoData);
                }
                System.out.println("====="+user_id+"님의 Todo 전체 목록=====");
                if(todos.size()>0){
                    todos.forEach((todo)-> System.out.println(todo));
                }else {
                    System.out.println("## 작성하신 Todo 목록이 없습니다!");
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void getCompletedTodosByUserId(String user_id) {
        String sql = "SELECT * FROM todo WHERE user_id=? AND is_completed=1";
        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, user_id);
            ArrayList<Todovo> todos = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo= rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    Todovo todoData = new Todovo(id,userId,todo,is_completed,created_at);
                    todos.add(todoData);
                }
                System.out.println("====="+user_id+"님의 Todo 전체 목록=====");
                if(todos.size()>0){
                    todos.forEach((todo)-> System.out.println(todo));
                }else {
                    System.out.println("## 작성하신 Todo 목록이 없습니다!");
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void getUncompletedTodosUserId(String user_id) {
        String sql ="SELECT * FROM todo WHERE user_id=? and is_completed=?";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, user_id);
            ArrayList<Todovo> todos = new ArrayList<>();
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo= rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    Todovo todoData = new Todovo(id,userId,todo,is_completed,created_at);
                    todos.add(todoData);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void makeTodoCompleted(int id, String user_id) {
        String sql = "UPDATE todo SET id=? WHERE user_id=?";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.setString(2, user_id);

            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("## ID 가 " + id + " 인 Todo 가 완료 처리 되었습니다 ##");
            } else {
                System.out.println("## ID 가 " + id + " 인 Todo 는 회원님의 Todo 가 아닙니다 ##");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void createTodo(String todo, String user_id) {
        String sql = "INSERT INTO todo (user_id,todo) VALUES (?,?)";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, user_id);
            ps.setString(2, todo);
            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("## Todo 생성 성공! ##");
            } else {
                System.out.println("## Todo 생성 실패! ##");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTodo(int id, String user_id) {
        String sql = "DELETE FROM todo WHERE user_id=?";

        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0){
                System.out.println("정상적으로 삭제되었습니다.");
            }else{
                System.out.println("id를 제대로 입력해주세요.");
            }
            ps.executeQuery();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getAllTodosWithUserName() {
        String sql = "SELECT t.id,t.user_id,t.todo,t.is_completed,t.created_at"+
          "FROM todo t"+
                "JOIN todo_user u ON t.user_id = u.user_id"+
                "ORDER BY t.id ASC";
        List<Todovo> todos = new ArrayList<>();
        try(Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql)){
            while (rs.next()) {
                int id = rs.getInt("id");
                String user_id = rs.getString("user_id");
                String todo = rs.getString("todo");
                boolean is_completed = rs.getBoolean("is_completed");
                String created_at = rs.getString("created_at");
                String userName = rs.getString("user_name");

                System.out.printf("id :%d, user_id :%s, 작성자 이름 : %s,todo:%s, is_completed:%b, created_at : %s%n ",
                        id, user_id, todo, is_completed, created_at);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
