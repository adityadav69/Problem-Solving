import java.util.ArrayList;

public class MaximumConsecutiveOnes {

    static int maximumOnes(int arr[]) {
        // int count = 0;
        // ArrayList <Integer> list=new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         list.add(count);
        //         count = 0;
        //     } else {
        //         count++;
        //     }
        // }
        // list.add(count);
        // System.out.println(list);
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)>max){
        //         max=list.get(i);
        //     }
        // }
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
 }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 1,1, 0, 1, 1, 1,1,1,1,1 };
        System.out.println(maximumOnes(arr));
    }
}
