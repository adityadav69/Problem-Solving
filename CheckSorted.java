public class CheckSorted {

    static boolean isSortedInAscendingOrder(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    static boolean isSortedInDecendingOrder(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,6,2};
        int arr2[]={5,4,3,2,2,1,2};

        System.out.println(isSortedInAscendingOrder(arr));
        System.out.println(isSortedInDecendingOrder(arr2));
    }
}
