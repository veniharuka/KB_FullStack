package afterStudy.test0809;

import java.util.*;

public class RotatingParentheses {
    static String s;

    public static void main(String[] args) {
        String sb = "[](){}";
        Solution solution = new Solution();
        int answer = solution.solution(sb);
        System.out.println("answer = " + answer);
    }

    static class Solution {
        public int solution(String s) {
            String sb = s + s;
            int answer = 0;
            for (int i = 0; i < s.length(); i++) {
                if (isValid(sb.substring(i, s.length() + i))) answer++;
            }
            return answer;
        }

        private boolean isValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();

            for (char cur : s.toCharArray()) {
                if (cur == '(' || cur == '{' || cur == '[') {
                    stack.push(cur);
                } else {
                    if (stack.isEmpty()) return false;

                    char target = stack.pop();
                    if ((cur == ')' && target != '(') ||
                            (cur == '}' && target != '{') ||
                            (cur == ']' && target != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
