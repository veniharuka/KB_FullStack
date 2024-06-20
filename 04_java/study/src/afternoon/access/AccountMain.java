package afternoon.access;

public class AccountMain {
    public static void main(String[] args) {
        Account account= new Account(10000);

        account.deposit(10000);
        account.withdraw(5000);

        System.out.println("남은 금액은 : "+account.balance);
    }
}
