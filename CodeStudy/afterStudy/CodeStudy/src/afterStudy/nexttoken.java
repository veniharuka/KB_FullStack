package afterStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class nexttoken {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//    // 010 1234 4567
//    //010 .1234 .4567 로 짤림
//        String first = st.nextToken();
//        String second = st.nextToken();
//        String third = st.nextToken();
//
//        System.out.println(first+second+third);


        Stack<Integer> Integerstack = new Stack<>();
//        Stack<Integer> Stringstack = new Stack<>();

        for(int i=0; i<input; i++){
            Integerstack.push(Integer.valueOf(br.readLine()));
        }
        int count =0;
        int max = 0;
        while(!Integerstack.isEmpty()) {
            int firstNum = Integerstack.pop();
            if (firstNum > max) {
                max = firstNum;
                count++;
            }
        }
        System.out.println(count);


//        System.out.println(stack.push(1));
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
    }
}
