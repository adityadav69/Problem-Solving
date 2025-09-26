public class CheckIfArrayIsSorted {

    static boolean chekSorted(int i,int arr[]){

        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]<=arr[i+1]){
            return chekSorted(i+1, arr);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(chekSorted(0, arr));
    }
}
