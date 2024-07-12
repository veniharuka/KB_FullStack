package afterStudy.study0712;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList<>(), visited, nums, result);
        return result;
    }

    // 순열을 만들어서 result에 추가하는 코드
    void backtrack(List<Integer> curr, boolean[] visited, int[] nums, List<List<Integer>> result) {
        // basecase 있어야 함
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // recursive call 도 필요
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            curr.add(nums[i]); // 추가
            visited[i] = true;
            backtrack(curr, visited, nums, result);
            curr.remove(curr.size() - 1); // 올바른 위치에서 요소 제거
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] nums = {1, 2, 3,4};
        List<List<Integer>> result = permutations.permute(nums);

        System.out.println("All permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
