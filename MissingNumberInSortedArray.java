public class MissingNumberInSortedArray {

    static int findMissing(int arr[]){
        int last=arr[arr.length-1];
        int sum=last*(last+1)/2;
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return sum-s;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(findMissing(arr));
    }
}
