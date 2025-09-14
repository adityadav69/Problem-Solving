import java.util.Arrays;

public class threeSumClosestJ {
    public static int threeSumClosest(int[] nums, int target) {
        // Array ko sort karo
        Arrays.sort(nums);
        
        int n = nums.length;
        // closest sum ko first possible sum se initialize karo
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // har element ko base bana kar loop karo
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // agar ye sum target ke aur kareeb hai to update karo
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // agar sum target ke barabar hai to turant return karo
                if (currentSum == target) {
                    return currentSum;
                }
                // agar sum chhota hai to left pointer ko aage badhao
                else if (currentSum < target) {
                    left++;
                }
                // agar sum bada hai to right pointer ko peeche lao
                else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }
    public static void main(String args[]){
        int arr[]={-1,2,1,-4};
        System.out.println(threeSumClosest(arr, 1));
    }
}
