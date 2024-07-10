package afterStudy.study0705;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackExample {
    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();

        // push
        s.push(1); // s: [1]
        s.push(2); // s: [2, 1]
        s.push(3); // s: [3, 2, 1]

        // top, pop

        System.out.println(s.peek()); // 출력: 3 // s: [3, 2, 1]
        System.out.println(s.pop()); // 출력: 3 // s: [2, 1]
        System.out.println(s.pop()); // 출력: 2 // s: [1]

        // push
        s.push(4); // s: [4, 1]
        s.push(5); // s: [5, 4, 1]

        // empty
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}


