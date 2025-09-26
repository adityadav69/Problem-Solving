public class LastOccurence {

    static int lo(int i,int arr[],int key){
        if(i==-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return lo(i-1, arr, key);
    }
    public static void main(String[] args) {
        int arr[]={8,31,6,9,5,10,2,5,3};
        System.out.println(lo(arr.length-1, arr, 5));
    }
}
