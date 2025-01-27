import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputString = br.readLine().split(" ");
        int[] input = new int[N];
        
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(inputString[i]);
        }

        int[] dp = new int[N];
        Arrays.fill(dp, 1); // 초기값: 각 원소는 최소 길이 1의 LIS를 가짐

        int maxLength = 1; // LIS 최대 길이

        // DP 점화식 적용
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] < input[i]) { // 증가 조건
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        System.out.println(maxLength);
    }
}
