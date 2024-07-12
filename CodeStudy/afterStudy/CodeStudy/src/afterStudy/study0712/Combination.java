package afterStudy.study0712;

import java.util.*;


class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, new ArrayList<>(), n, k, ans);
        return ans;
    }

    private void backtrack(int start, List<Integer> path, int n, int k, List<List<Integer>> ans) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, path, n, k, ans);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combination combination = new Combination();
        int n =4;
        int k = 2;
        System.out.println(combination.combine(n, k));
    }
}
