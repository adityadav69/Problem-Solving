import java.util.ArrayList;

public class RotateArrayByD {

    static void printArray(int arr[]) {
        System.out.println("Printing array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverse(int arr[],int start,int end){

        while (start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    // static void rotateByD(int arr[], int d) {

    //      int temp[]=new int[d];
    //     for (int i = 0; i < d; i++) {
    //         temp[i] = arr[i];
    //     }
      
    //     printArray(temp);

    //     for(int i=d;i<arr.length;i++){
    //         arr[i-d]=arr[i];
    //     }
    //     printArray(arr);

    //     for(int i=arr.length-2,j=0;i<arr.length;i++){
    //         arr[i]=temp[j];
    //         j++;
    //     }
    //     System.out.println("After rotating array look like");
    //     printArray(arr);
    // }

    //Optimal solution O(1) sc

    static void rotateByD(int arr[],int d){
        d=d%arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6,7 };
        rotateByD(arr, 2);
        printArray(arr);
    }
}
