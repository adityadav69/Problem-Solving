public class first {

    static void printOccurence(int arr[], int element, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == element) {
            System.out.print(index + " ");
        } 
        printOccurence(arr, element, index + 1);

    }

    public static void main(String args[]) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        printOccurence(arr, 2, 0);
    }
}