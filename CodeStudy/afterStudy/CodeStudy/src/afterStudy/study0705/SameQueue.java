package afterStudy.study0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

import java.util.Queue;
import java.util.StringTokenizer;


public class SameQueue {
    public static void main(String[] args) {

        SameQueue s = new SameQueue();
        int result = s.SameQueue(new int[]{3,2,7,2}, new int[]{4,6,5,1});
        System.out.println(result);



    }

        public int SameQueue(int[] queue1, int[] queue2) {
            Queue<Integer> q1 = new ArrayDeque<>();
            Queue<Integer> q2 = new ArrayDeque<>();

            int q1sum = 0, q2sum = 0;
            int n=queue1.length;

            for(int value: queue1){
                q1.add(value);
                q1sum += value;
            }
            for(int value: queue2){
                q2.add(value);
                q2sum += value;
            }

            for (int i = 0; i < 4*n; i++) {

                if (q1sum > q2sum) {
                    int value=q1.remove();
                    q2.add(value);
                    q1sum -= value;
                    q2sum += value;
                }else if(q1sum < q2sum){
                    int value=q2.remove();
                    q1.add(value);
                    q2sum -= value;
                    q1sum += value;
                }else {
                    return i;
                }
            }



            return -1;
        }
}
