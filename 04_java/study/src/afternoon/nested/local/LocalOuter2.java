package afternoon.nested.local;

public class LocalOuter2 {
    private String outerInstance ="outerInstance1";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString1";

        class LocalInner implements Print {
            String LocalInstance = "LocalInstance1";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("LocalInstance = " + LocalInstance);

            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printLocal();
    }


    public static void main(String[] args) {
        LocalOuter2 localOuter = new LocalOuter2();
        localOuter.outerMethod("methodString2");
    }

}
