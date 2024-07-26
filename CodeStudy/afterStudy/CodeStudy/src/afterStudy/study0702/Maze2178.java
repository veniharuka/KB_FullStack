package afterStudy.study0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maze2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X= Integer.parseInt(st.nextToken());
        int Y= Integer.parseInt(st.nextToken());

//         visited = new boolean[X+1][Y+1];


        int[][] maze = new int[X+1][Y+1];
        for (int i = 0; i < X; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < Y; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());

            }
        }
    }
}
