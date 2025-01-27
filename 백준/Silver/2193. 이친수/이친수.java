import java.util.*;
import java.io.*;

public class Main {
    static long[] dp; // int 대신 long 사용 (값이 클 수 있음)
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[91]; // N 최대값이 90이므로 91 크기로 선언
        
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= N; i++) { 
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);
    }
}
