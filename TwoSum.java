import java.util.HashMap;

public class TwoSum {

    static void twoSum(int arr[],int target){
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ls=target-arr[i];
            if(hm.containsKey(ls)){
                System.out.println("indexes are "+hm.get(ls)+" "+i);
                return;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        System.out.println("Not any indexes");
    }
    public static void main(String[] args) {
        int arr[]={2,8,6,4,9};
        twoSum(arr, 14);
    }
}
