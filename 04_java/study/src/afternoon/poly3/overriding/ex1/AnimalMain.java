package afternoon.poly3.overriding.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Dog(),new Cat(), new Duck()};

        for(Animal animal : animals) {
            animallCall(animal);
        }


    }

    public static void animallCall(Animal animal) {
        animal.sound();

        if(animal instanceof Duck) {
            ((Duck)animal).fly();
        }

    }



}
