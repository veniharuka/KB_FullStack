import java.io.*;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int alen = a.length();
        int blen = b.length();
        dp = new int[alen + 1][blen + 1];

        // LCS 길이 구하기 (Bottom-Up DP)
        for (int i = 1; i <= alen; i++) {
            for (int j = 1; j <= blen; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // LCS 길이 출력 (이것만 출력해야 함)
        System.out.println(dp[alen][blen]);
    }
}
