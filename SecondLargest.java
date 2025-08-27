public class SecondLargest {
    static int findSecondLargest(int arr[]){
        int largest=arr[0];
        int sLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,32,4,2,4,3343,44,34,3332,878};
        System.out.println("second largest number is "+findSecondLargest(arr));
    }
}
