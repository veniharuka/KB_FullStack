package afternoon.generic.limit;

public class LongWorld {
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
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
