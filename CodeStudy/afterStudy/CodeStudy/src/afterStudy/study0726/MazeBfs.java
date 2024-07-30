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
       return (r>=0 && r<rowLength) && (c>=0 && c< colLength) && (grid[r][c] == 1);
    }
    public static void bfs(int r, int c) {
        Deque<int[]> que = new LinkedList<>();
        que.add(new int[]{r, c});
        visited[r][c] = true;
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int curRow = cur[0];
            int curCol = cur[1];

            for(int i = 0; i < dr.length; i++) {
                int newRow = curRow + dr[i];
                int newCol = curCol + dc[i];
                if(isValid(newRow, newCol)) {
                    visited[newRow][newCol] = true;
                    que.add(new int[]{newRow, newCol});

                }
            }
        }
    }
}
