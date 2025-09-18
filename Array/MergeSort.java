import java.util.ArrayList;

public class MergeSort {

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        // int arr2[]=new int[high-low+1];
        ArrayList<Integer>list=new ArrayList<>();
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            list.add(arr[left]);
            left++;
        }
        while (right<=high) {
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }

    static void mergesort(int arr[],int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,25,6,4};
        System.out.println("Before Sorting");
        print(arr);
        mergesort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        print(arr);
        
    }
}
