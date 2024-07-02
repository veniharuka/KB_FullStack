package afternoon.nested.inner;

public class Outer {
    private static   String outerStatic = "outer";
    private String outerInstance = "outerInstance";

      class Inner {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print(){
            // 클래스 내부의 static에 접근, 미리 생성되어있으니깐 알고 있어서 접근 가능함.
            System.out.println("nestedStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static(인스턴스)에 접근, 내부는 자기거니깐 가능하지만 outer는 안됨
            System.out.println("nestedInstance = " + nestedInstance);
            System.out.println("outerInstance = " + outerInstance);

        }
    }
}
