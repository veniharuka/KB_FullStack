package afternoon.interfacee;

import afternoon.abstractt.AbstractAnimal;

public class HumanMain {
    public static void main(String[] args) {

    Human[] humans = new Human[3];
    humans[0]= new Korean();
    humans[1]= new American();
    humans[2]= new Spanish();

//    Human[] humans2 = {new Korean(), new American(), new Spanish()};
//    이렇게도 가능

        for(Human human : humans){
            humanCall(human);
        }
    }

    public static void humanCall(Human human){
        human.speak();
        human.eat();
        human.hello();





    }



}
