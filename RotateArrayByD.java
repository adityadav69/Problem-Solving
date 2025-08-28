public class RotateArrayByD {

    static void printArray(int arr[]) {
        System.out.println("Printing array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void rotateByD(int arr[], int d) {

         int temp[]=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
      
        printArray(temp);

        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        printArray(arr);

        for(int i=arr.length-2,j=0;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
        System.out.println("After rotating array look like");
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6,7 };
        rotateByD(arr, 2);
    }
}
