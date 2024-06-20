package afternoon.access.refactor;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행","gold","최민준",1000000000);

        //public 요소 접근
        System.out.println(account.bank);

        //default 요소 접근
        System.out.println(account.grade);

        //private 요소 접근-안됨
//        System.out.println(account.name);


    }
}
