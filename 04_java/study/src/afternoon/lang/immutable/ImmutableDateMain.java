package afternoon.lang.immutable;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableDate date1 = new ImmutableDate(2024, 7, 1);
        ImmutableDate date2 = date1;

        System.out.println("date2의 년도만 2025로 변경");
        date2 = date2.setYear(2025);




        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
