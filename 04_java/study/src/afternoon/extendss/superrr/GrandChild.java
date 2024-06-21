package afternoon.extendss.superrr;

public class GrandChild extends Child {
    public GrandChild() {
        super("이르으으음");  //child생성자는 매개변수를 받고 있는데 ()만하면 오류남 1개든 2개는 맞게 받아와야됨
        System.out.println("GrandChild 생성자");
    }
}
