package afterStudy;
import java.io.*;
import java.util.StringTokenizer;



public class Blackjack {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());



       int N,M = Integer.parseInt(br.readLine());
       int [] arr = new int[N];

       for (int i = 0; i < N; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
       }

       int result = search(arr,N,M);
       System.out.println(result);

   }

   static int search(int[] arr, int N, int M) {

   }


}
