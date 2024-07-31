package afterStudy.study0806;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MarbleEscape {
    static boolean[][] visited;
    static int[][] grid;
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static int rowLength;
    static int colLength;

    // n,m 대비 실제 공간은 n-2 , m-2
    // 왼,오,위,아 기울이기 메서드 필요할듯

    public static boolean isValid(int r, int c) {
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength) && (grid[r][c] == 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

    }



    public static void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        visited[r][c] = true;
    }

}
