package afternoon.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ClaszzMain {
    public static void main(String[] args) throws Exception {
        Class clazz1 = User.class; // 1. 클래스에서 직접 조회
        Class clazz2 = new User("효석").getClass(); // 2.인스턴스를 만들어서 조회
        Class clazz3 = Class.forName("afternoon.lang.clazz.User");
        // clazz1,2,3 다 동일한 데이터를 끌고 옴


        // 모든 필드(멤버 편수)
        Field[] fields = clazz1.getDeclaredFields();
        
        for(Field f : fields) {
            System.out.println("f = " + f);
        }

        //상위 클래스 정보 출력
        System.out.println("상위 클래스 : "+ clazz1.getSuperclass());


        // 상위 인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        // class는 다중상속 안되지만 인터페이스는 다중 구현 가능하니깐 배열
        for(Class i : interfaces) {
            System.out.println("상위 인터페이스 = " + i);
            //상위 인터페이스가 없어서 빈 공간이 print됨
        }

        // class 정보를 바탕으로 인스턴스 만들기
        User user =(User) clazz1.getDeclaredConstructor().newInstance();
//        User user2 = new User("시완");  이건 예전 방식
        System.out.println("user = " + user);

        }
}
