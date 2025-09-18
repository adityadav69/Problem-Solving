import java.util.Arrays;

public class LargestConsecutiveElement {
    
    static int getMax(int arr[]){
        Arrays.sort(arr);
        int max=1;
        int count=1;
        int lastSmaller=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmaller){
                lastSmaller=arr[i];
                count++;
            }
            else if(arr[i]==lastSmaller){
                continue;
            }
            else{
                count=1;
                lastSmaller=arr[i];
            }
            max=Math.max(count, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,6,7,1,9,4,5,3};
        System.out.println(getMax(arr));
    }
}
