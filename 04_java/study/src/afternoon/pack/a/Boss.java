package afternoon.pack.a;

public class Boss {
    String name;
    int age;

    public void printBoss(String name,int age) {
        this.name=name;
        this.age=age;
        System.out.println("사장이 전달합니다.");
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
    }
}
