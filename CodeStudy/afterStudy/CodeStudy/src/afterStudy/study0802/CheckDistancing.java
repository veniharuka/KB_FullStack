package afterStudy.study0802;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CheckDistancing {
    static int[]dr = {0,1,0,-1};
    static int[]dc = {1,0,-1,0};

    static String[][] places;


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answer = new int[places.length];
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        int[] results = solution(places);

        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] solution(String[][] places) {

        return new int[0];
    }

    public void dfs(){

    }

}
