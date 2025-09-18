import java.util.*;
public class LargestElement{

    static int largestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        // int arr[]={1,3,5,2,5,67,8,5};
        int arr[]={1,1,1,1,1};
        System.out.println(largestNumber(arr));
    }
}