import java.util.*;

public class PhoneNumberCombination {
    private static final String[] keypad = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };

    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        backtrack(arr, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int[] arr, int index, StringBuilder current, ArrayList<String> result) {
        if (index == arr.length) {
            result.add(current.toString());
            return;
        }

        int d = arr[index];
        // guard: skip invalid digits outside 0..9
        if (d < 0 || d > 9) {
            backtrack(arr, index + 1, current, result);
            return;
        }

        String letters = keypad[d];
        // KEY FIX: if digit maps to empty string (0 or 1), just skip it
        if (letters == null || letters.length() == 0) {
            backtrack(arr, index + 1, current, result);
            return;
        }

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(arr, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    // quick main to test
    public static void main(String[] args) {
        PhoneNumberCombination s = new PhoneNumberCombination();
        System.out.println(s.possibleWords(new int[]{1, 4})); // prints [g, h, i]
    }
}
    