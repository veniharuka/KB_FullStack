package afterStudy.study0719;

import java.util.*;

public class BFS {
    public int solution(String begin, String target, String[] words) {
        Queue<WordState> q = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        // begin은 0부터 시작
        q.offer(new WordState(begin, 0));

        while (!q.isEmpty()) {
            // 방문
            // 방문한 곳이 내가 찾던 target이라면 return cnt
            WordState cur = q.poll();
            if (cur.word.equals(target)) {
                return cur.cnt;
            }
            // 예약, hit 다음 nextvertex가 무엇인지 알려주지 않아서
            // 우리가 직접 찾아야 한다. 그래서 nextvertex사용 x
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && getDiffCount(cur.word, words[i]) == 1) {
                    q.offer(new WordState(words[i], cur.cnt + 1));
                    visited[i] = true;
                }
            }
        }
        return 0; // 이 부분을 while 루프 밖으로 이동
    }

    int getDiffCount(String word, String target) {
        int diffCnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                diffCnt++;
            }
        }
        return diffCnt;
    }

    class WordState {
        String word;
        int cnt;

        WordState(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int result = bfs.solution(begin, target, words);
        System.out.println(result); // Expected output: 4
    }
}
