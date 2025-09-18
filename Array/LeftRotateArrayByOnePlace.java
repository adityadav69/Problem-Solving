public class LeftRotateArrayByOnePlace {

    static void rotate(int arr[]){
        int left=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=left;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        rotate(arr);
        System.out.println("After rotating");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
