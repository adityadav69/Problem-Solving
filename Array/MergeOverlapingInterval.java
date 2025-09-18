import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlapingInterval {

    static void print(int arr[][]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.print("],");
        }
        System.out.println("]");
    }

    static ArrayList<ArrayList<Integer>> overlapping(int arr[][]) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                // Overlapping interval, extend the end if needed
                end = Math.max(end, arr[i][1]);
            }
            else{
                ArrayList <Integer> list=new ArrayList<>();
                list.add(start);
                list.add(end);
                ans.add(list);
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        ArrayList <Integer> list =new ArrayList<>();
        list.add(start);
        list.add(end);
        ans.add(list);

        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 15, 18 }, { 16, 17 } };
        print(arr);
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        Arrays.sort(arr);
        System.out.println("After sorting");
        print(arr);

        // System.out.println(overlapping(arr));

    }
}
