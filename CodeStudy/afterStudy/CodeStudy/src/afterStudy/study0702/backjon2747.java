package afterStudy.study0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class backjon2747 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        int[] intArray = new int[n+1];
        intArray[0] = 0;
        intArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            intArray[i] = intArray[i - 1] + intArray[i - 2];
        }


        System.out.println(intArray[n]);
    }
}
