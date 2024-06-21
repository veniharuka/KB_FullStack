package afternoon.poly1;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();


        //iter 하면 for문 자동으로 완성됨


        donkey.sound();
        dog.sound();
        cat.sound();
        chicken.sound();

    }
    private static class Donkey {}
}
