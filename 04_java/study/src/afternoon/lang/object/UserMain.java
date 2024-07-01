package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {
         User user1 =new User("최민준","veniharuka");
         User user2 = new User("최민준", "veniharuka");


        System.out.println(user1==user2);
        System.out.println(user2.equals(user1));

    }
}
