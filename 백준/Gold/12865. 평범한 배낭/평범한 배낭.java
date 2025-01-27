import java.util.*;
import java.io.*;

public class Main {
    static int N; // 물건 개수
    static int K; // 배낭 용량
    static int[][] bag; // 물건 정보 (무게, 가치)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N과 K 입력받기
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        
        // 물건 정보 입력받기
        bag = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            bag[i][0] = Integer.parseInt(line[0]); // 무게
            bag[i][1] = Integer.parseInt(line[1]); // 가치
        }
        
        // DP 배열 선언 및 초기화
        int[] dp = new int[K + 1];
        
        // DP 점화식
        for (int i = 0; i < N; i++) { // 물건 하나씩 고려
            int weight = bag[i][0];
            int value = bag[i][1];
            for (int j = K; j >= weight; j--) { // 뒤에서부터 탐색
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
        }
        
        // 결과 출력
        System.out.println(dp[K]);
    }
}
