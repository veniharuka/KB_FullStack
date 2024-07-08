package afternoon.generic.limit;

public class GenericWorld<Type extends Number > {
    private Type number;

    public Type getNumber() {
        return number;
    }

    public void setNumber(Type value) {
        this.number = value;
    }

    public double transDouble(){
        return this.number.doubleValue();
    }


    @Override
    public String toString() {
        return "GenericWorld{" +
                "number=" + number +
                '}';
    }
}
