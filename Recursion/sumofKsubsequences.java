import java.util.*;

class sumofKsubsequences {
    public static int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        int n = nums.length;
        
        Arrays.sort(nums);
        
        // precompute powers of 2
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        
        int left = 0, right = n - 1;
        int ans = 0;
        
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                ans = (ans + pow2[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(numSubseq(arr,2));
    }
}
