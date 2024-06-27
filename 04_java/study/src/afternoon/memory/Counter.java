package afternoon.memory;

public class Counter {
    public static int counter=0;

    Counter(){
        this.counter++;
        //인스턴스일 때 자기 자신을 가리키는 것인데 클래스에 고정되니깐
//        굳이 인스턴스에 붙을필요 없음
    }
    //Counter가 인스턴스화될 때마다 1씩오름
}
