package afternoon.ref;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "최민준";




        Customer customer2 = null;


        customer2 = customer1;
        System.out.println(customer2.name);
        System.out.println(customer1.name);
    }
}
