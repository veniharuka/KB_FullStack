package afterStudy.test0809;
import java.util.*;
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};  // 여기서 테스트 배열을 정의합니다.
        Solution s = new Solution();
        int[] result = s.solution(prices);

        // 결과를 출력합니다.
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty()) {
                    int j = stack.peek();
                    if (prices[i] < prices[j]) {
                        answer[j] = i - j;
                        stack.pop();
                    } else break;
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                int i = stack.pop();
                answer[i] = prices.length - i - 1;
            }
            return answer;
        }
    }
}
