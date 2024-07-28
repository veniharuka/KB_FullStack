package afterStudy.study0726;

import java.util.*;

public class MazeBfs {
    static boolean[][] visited;
    static int[][] grid;
    static int[] dr = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};
    static int rowLength;
    static int colLength;
    public static void main(String[] args) {
        grid = new int[][]{
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0}

        };
        rowLength = grid.length;
        colLength = grid[0].length;
        visited = new boolean[rowLength][colLength];
        bfs(0,0);

    }

    public static boolean isValid(int r, int c) {
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength) && (grid[r][c] == 1);
    }
    public static void bfs(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if(isValid(nr, nc)) {
                    if(!visited[nr][nc]) {
                        queue.add(new int[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }

            }
        }
    }
}
