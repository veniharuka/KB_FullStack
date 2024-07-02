package afternoon.nested.local;

public class AnonymousOuter {
    private String outerInstance ="outerInstance1";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString1";

        Print print = new Print(){
            String LocalInstance = "LocalInstance1";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("LocalInstance = " + LocalInstance);

            }
        };

        print.printLocal();
    }


    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.outerMethod("methodString2");
    }

}
