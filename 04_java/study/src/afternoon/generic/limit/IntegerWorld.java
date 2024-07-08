package afternoon.generic.limit;

public class IntegerWorld {
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double transDouble(){
        return number.doubleValue(); //숫자형 변수한테만 사용
    }

    @Override
    public String toString() {
        return "IntegerWorld{" +
                "number=" + number +
                '}';
    }
}
