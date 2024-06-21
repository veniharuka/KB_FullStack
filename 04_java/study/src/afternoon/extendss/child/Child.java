package afternoon.extendss.child;

import afternoon.extendss.parent.Parent;

public class Child extends Parent {
    public void access(){
        System.out.println("PublicValue :"+publicValue);//어디서든 가능
        System.out.println("protectedValue :"+protectedValue);//패키지는 달라도 상속관계라 가능
//        System.out.println("defaultValue : "+defaultValue);//패키지 달라서 불가능
//        System.out.println("privateValue : "+privateValue);//같은 클래스가 아니라 불가능


        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
        printParent();
    }
}
