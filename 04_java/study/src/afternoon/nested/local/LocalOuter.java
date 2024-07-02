package afternoon.nested.local;

public class LocalOuter {
    private String outerInstance ="outerInstance1";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString1";

        class LocalInner {
            String LocalInstance = "LocalInstance1";

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
        LocalOuter localOuter = new LocalOuter();
        localOuter.outerMethod("methodString2");
    }

}
