package afterStudy.studybfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static boolean[] visited;
    static int[][] graph;
    static int N, M, start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i][i] = 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        bfs(start);
    }


    public static void bfs(int start) {
        // BFS에 사용할 큐 초기화
        Queue<Integer> queue = new LinkedList<>();
        // 시작 노드를 큐에 추가
        queue.add(start);
        // 큐가 비어 있지 않은 동안 반복 {}
        while(!queue.isEmpty()){


            int currentNode =queue.poll();
            if(!visited[currentNode])    {
                System.out.println(currentNode);
                visited[currentNode] = true;


                for(int i=1; i<N; i++){
                    if(graph[currentNode][i] == 1 &&!visited[i]){
                            queue.add(i);
                    }
                }

            }
        }

        // {파트시작}
        // 큐에서 현재 노드를 꺼냄
        // 현재 노드가 아직 방문되지 않았다면
        // 방문한 노드를 기록
        // 현재 노드를 방문으로 표시
        // 현재 노드의 모든 인접 노드를 탐색
        // 원소의 개수(N)만큼 for문 반복
        // 인접 노드이고(연결되어있고) 아직 방문하지 않은 경우
        // 인접 노드를 큐에 추가
    }
}