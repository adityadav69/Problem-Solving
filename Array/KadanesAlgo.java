public class KadanesAlgo{
    
    static public int maxSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-1,4,5,2,7};
        System.out.println(maxSum(arr));
    }
}