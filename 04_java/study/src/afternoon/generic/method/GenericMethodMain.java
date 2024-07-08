package afternoon.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer integer = GenericMethod.<Integer> genericMethod(10);
        Double integer2 = GenericMethod.<Double> numberMethod(10.2);
    }
}
