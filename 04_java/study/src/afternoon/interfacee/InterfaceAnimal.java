package afternoon.interfacee;

public interface InterfaceAnimal {
    void eat();
    void sound();
    // Interface 내에서는 public abstract를 없애도 문제 없다.
    // sound () 뒤에 {}를 하면 오류가 생기는 이유는 public abstract가
    // 보이지 않을 뿐 존재하기 때문이다.
}
