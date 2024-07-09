package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExMain {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10)+1;
        }

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }


        if(set.size() == arr.length) {
            System.out.println("중복이 아니다!");
        }else {
            System.out.println("중복이다!");
        }


    }
}
