package org.scoula.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
//@data annotation는 equals,hashcode와 getter와 setter도 만들어준다.
// @AllArgsConstructor는 생성자를 만들어준다.
@Data
@AllArgsConstructor

public class UserVO {
    private final int id;
    private final String userid;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp created;

}
