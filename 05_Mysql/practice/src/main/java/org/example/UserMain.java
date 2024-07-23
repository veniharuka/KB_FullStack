package org.example;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        userDao.create("tetz","1234");
        userDao.getAllUsers();

        userDao.updateUser(4,"lhs","adbc");
        userDao.getAllUsers();


        userDao.deleteUser(4);
        userDao.getAllUsers();

        userDao.getAllUsersWithName();
    }
}
