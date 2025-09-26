public class LastOccurence {

    // static int lo(int i,int arr[],int key){
    // if(i==-1){
    // return -1;
    // }

    // if(arr[i]==key){
    // return i;
    // }

    // return lo(i-1, arr, key);
    // }

    static int lo(int i, int arr[], int key) {
        if (i == arr.length) {
            return -1;
        }
        int result = lo(i + 1, arr, key);
        if (result != -1) {
            return result; // agar aage last occurrence mil gaya
        }
        if (arr[i] == key) {
            return i; // warna current index return karo
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 31, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(lo(0, arr, 5));
    }
}
