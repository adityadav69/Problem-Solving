import java.util.*;
public class reversee {

    static void reverse(int arr[],int start,int end){

        while (start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;
        reverse(arr,arr.length-k,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        
    }
}
