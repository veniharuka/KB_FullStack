package org.example;

import java.util.List;

public class UserMainV2 {
    public static void main(String[] args) {
        UserDaoV2 userDao = new UserDaoV2();

        //회원 추가, 이제는 객체를 전달

//        UserVo newUser = new UserVo(0, "tetz2", "1234");
//        userDao.addUser(newUser);

        List<UserVo> users = userDao.getAllUsers();
        for(UserVo user : users){
//            System.out.println(user);
            System.out.print("아이디는 :"+user.getId()+" / ");
            System.out.print("이메일은 :"+user.getEmail()+" / ");
            System.out.print("비밀번호는 :"+user.getPassword()+"  \n");

        }

        userDao.close();
    }
}
