package afternoon.access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (isValidAmount(amount)) {
            this.balance += amount;
            System.out.println("현재 잔고는 :" + this.balance);
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isValidAmount(amount)) {
            if (isPossibleWithdraw(amount)) {
                this.balance -= amount;
                System.out.println("현재 잔고는 :" + this.balance);
            }
        } else {
            System.out.println("잔고가 부족합니다. 현재잔고 : "+this.balance);
        }
    }

    public void getBalance() {
        System.out.println("현재 잔고는 :"+this.balance);
    }

    private boolean isValidAmount(int amount) {
        return amount > 0;
    }
    private boolean isPossibleWithdraw(int amount) {
        return this.balance >= amount;
    }

}
//ctr+alt+l 버튼 누르면 깔끔하게 정리됨