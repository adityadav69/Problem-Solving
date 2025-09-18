import java.util.HashMap;
import java.util.Map;

public class MajorityElementUsingMooreeAlgo{

    static int findMajority(int arr[]){
        // int count=0;
        // int el=0;

        // for(int i=0;i<arr.length;i++){
        //     if(count==0){
        //         count=1;
        //         el=arr[i];
        //     }
        //     else if(el==arr[i]){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        // }

        // int result=0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==el){
        //         result++;
        //     }
        // }

        // if(result>arr.length/2){
        //     return el;
        // }
        // else{
        // return -1;
        // }

        //using HashMap

        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

       for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(findMajority(arr));        
    }
}