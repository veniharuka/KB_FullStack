package org.scoula.user2;

public class UserMangeProgram {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.getAllUsers();
        userDAO.close();
    }
}
