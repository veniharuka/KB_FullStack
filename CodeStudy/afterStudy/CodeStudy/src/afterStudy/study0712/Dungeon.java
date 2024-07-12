package afterStudy.study0712;
import java.util.*;

public class Dungeon {
    int answer =0;
    public int solution(int k, int[][] dungeons) {

        int n = dungeons.length;
        boolean[] visited = new boolean[n];
        backtrack(dungeons,k,visited,n,0);

        return answer;
    }
    public void backtrack(int[][] dungeons, int fatigue, boolean[] visited, int n, int cnt) {
        // basecase

        if(cnt> answer){
            answer=cnt;
        }

        for(int i = 0; i < n; i++) {
            if(fatigue >dungeons[i][0]  && !visited[i]) {
                visited[i] = true;
                backtrack(dungeons,fatigue-dungeons[i][1] ,visited,n,cnt+1);
                visited[i] = false;
            }
        }


        // recursive call

    }
}

