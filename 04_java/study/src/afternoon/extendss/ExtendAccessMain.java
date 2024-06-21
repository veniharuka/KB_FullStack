package afternoon.extendss;

import afternoon.extendss.child.Child;
import afternoon.extendss.parent.Parent;

public class ExtendAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.access();
        child.printParent();

        System.out.println("======================부모======================");
        Parent parent = new Parent();
        parent.printParent();
    }
}
