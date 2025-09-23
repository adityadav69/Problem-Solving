import java.util.ArrayList;
import java.util.List;

public class CombinationOfSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

private static void backtrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == candidates.length || target < 0) {
            return;
        }

        current.add(candidates[index]);
        backtrack(index, candidates, target - candidates[index], current, result);
        current.remove(current.size() - 1);

        backtrack(index + 1, candidates, target, current, result);
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        System.out.println(combinationSum(arr, 7));
    }
}
