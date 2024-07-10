package afterStudy.study0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class CorrectBracket {

        boolean solution(String s) {
            boolean answer = true;
            Deque<Character> stack = new ArrayDeque<>();

            //for 반복문을 돌려서 문자 하나하나에 접근한다.
            //열린괄호면~
                //스택에 넣어준다,
            //닫힌괄호면~
                //스택 팝().
            //다 돌았는데 스택 비어있으면 짝이 맞다. 비어있으면 false

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                }else if(s.charAt(i) == ')') {
                    if(stack.isEmpty()) {
                        return false;
                    }else{
                        stack.pop();
                    }
                }

            }

            return stack.isEmpty();
        }


    public static void main(String[] args) {
        CorrectBracket cb = new CorrectBracket();

        try {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s =br.readLine();
            boolean result = cb.solution(s);
            System.out.println(result);
        }catch (IOException e) {
            e.printStackTrace();
        }






    }
}
