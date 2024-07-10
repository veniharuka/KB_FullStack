//package afterStudy;
//import java.util.*;
//
//public class sieveOfEratosthenes {
//    public static void main(String[] args) {
//        public int solution(int[] nums) {
//            int count = 0;
//            int maxSum = 2997;  // 최대 합은 1000 + 999 + 998 = 2997
//            //✅ 에라토스 테네스의 체를 생성한다.
//            boolean[] isPrime = sieveOfEratosthenes(maxSum);
//
//            //✅ nums에서 숫자 세개를 고른다.
//            for (int i = 0; i < nums.length - 2; i++) {
//                for (int j = i + 1; j < nums.length - 1; j++) {
//                    for (int k = j + 1; k < nums.length; k++) {
//                        int sum = nums[i] + nums[j] + nums[k];
//                        //✅ 세 숫자의 합이 소수라면 카운터를 1 증가시킨다.
//                        if (isPrime[sum]) count++;
//                    }
//                }
//            }
//
//            return count;
//        }
//
//        private boolean[] sieveOfEratosthenes(int max) {
//            boolean[] isPrime = new boolean[max + 1];
//            Arrays.fill(isPrime, true);
//            isPrime[0] = isPrime[1] = false;  // 0과 1은 소수가 아님
//
//            for (int i = 2; i * i <= max; i++) {
//                if (isPrime[i]) {
//                    for (int j = i * i; j <= max; j += i) {
//                        isPrime[j] = false;
//                    }
//                }
//            }
//
//            return isPrime;
//        }
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
