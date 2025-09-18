import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUsingTwoPointer {
     static void twoSum(int arr[],int target){
        Arrays.sort(arr);
       int start=0;
       int end=arr.length-1;
       while (start<end) {
            if(arr[start]+arr[end]==target){
                System.out.println("YES EXIST");
                return;
            }
            else if(arr[start]+arr[end]>target){
                end--;
            }
            else{
                start++;
            }
       }
       System.out.println("NO NOT EXIST");
    }
    public static void main(String[] args) {
        int arr[]={2,8,6,4,9};
        twoSum(arr, 19);
    }
}
