package afternoon.poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child) parent1;


        //2번코드
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
    }
}
