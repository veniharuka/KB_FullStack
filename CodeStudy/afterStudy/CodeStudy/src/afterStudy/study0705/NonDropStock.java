package afterStudy.study0705;
import java.util.*;
public class NonDropStock {
    public static void main(String[] args) {
//        prices =[1, 2, 3, 2, 3];
    }


    class Solution {
        public int[] solution(int[] prices) {
            int[] ans = new int[prices.length];
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[stack.peek()] < prices[i]) {}
            }

            return ans;
        }
    }
}
