package afternoon.generic.limit;

public class World1 {
    public static void main(String[] args) {
        IntegerWorld integerWorld = new IntegerWorld();
        integerWorld.setNumber(10);
        System.out.println(integerWorld.getNumber());

        IntegerWorld integerWorld2 = new IntegerWorld();
//        IntegerWorld.setNumber(10.3);


        LongWorld longWorld1 = new LongWorld();
        longWorld1.setNumber(20L);
        System.out.println(longWorld1.getNumber());
    }
}
