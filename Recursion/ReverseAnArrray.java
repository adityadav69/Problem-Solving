public class ReverseAnArrray {

    static void reverseArray(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr, left+1, right-1);

}
    public static void main(String[] args) {
        int arr[]={2,4,1,5,8};
        reverseArray(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
