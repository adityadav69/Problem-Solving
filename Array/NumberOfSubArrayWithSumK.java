public class NumberOfSubArrayWithSumK {

    static int countSubarray(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        System.out.println(countSubarray(arr, -10));
    }
}
