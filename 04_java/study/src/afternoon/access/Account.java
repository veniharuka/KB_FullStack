package afternoon.access;

public class Account {
    int balance;

    Account(int init){
        this.balance = init;
    }
    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        balance -= amount;
    }

}
