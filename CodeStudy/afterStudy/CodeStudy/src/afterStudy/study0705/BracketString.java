package afterStudy.study0705;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BracketString {

    public boolean isValid(String s) {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                // 닫는 괄호인 경우
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(c)) {
                    return false;
                }
            } else {
                // 여는 괄호인 경우
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketString bs = new BracketString();

        // 테스트 케이스
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "]()[{}";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(test1 + " is valid: " + bs.isValid(test1)); // true
        System.out.println(test2 + " is valid: " + bs.isValid(test2)); // true
        System.out.println(test3 + " is valid: " + bs.isValid(test3)); // false
        System.out.println(test4 + " is valid: " + bs.isValid(test4)); // false
        System.out.println(test5 + " is valid: " + bs.isValid(test5)); // true
    }
}
