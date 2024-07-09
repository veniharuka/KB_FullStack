package afternoon.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10)+1;
            map.put(i+1, 0);
        }


        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.get(num)+1);
        }

        System.out.println("map = " + map);

        


    }
}
