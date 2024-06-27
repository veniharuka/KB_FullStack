package afternoon.poly4.prac1;

import afternoon.poly4.Human;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();

//        Animal[] animals2 = {new Dog(), new Cat(), new Duck()};
        //  이렇게 만들어도 문제 없다.

//        for(Animal animal : animals){
//            animalDo(animal);
//
//            if(animal instanceof Dog){
//                flyDo((Fly) animal);
//            }
//        }

        for(int i=0; i<animals.length; i++){
            animalDo(animals[i]);

            if(animals[i] instanceof Fly){
                flyDo((Fly) animals[i]);
            }

        }

    }
    public static void animalDo(Animal animal) {
        animal.eat();
        animal.sound();
    }

    public static void flyDo(Fly fly) {
        fly.fly();
    }

}
