import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {

    // static ArrayList<Integer> findMajority(int arr[]) {
    //     ArrayList<Integer> list = new ArrayList<>();

    //     for (int i = 0; i < arr.length; i++) {
    //         int count = 0;
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 count++;
    //             }
    //         }
    //         if (count > arr.length / 3 && !list.contains(arr[i])) {
    //             list.add(arr[i]);
    //         }

    //     }

    //     return list;
    // }


    static ArrayList<Integer> findMajority(int arr[]){
        ArrayList <Integer> list=new ArrayList<>();
        HashMap <Integer,Integer> hm =new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                 hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }

            if(hm.get(arr[i])>arr.length/3){
                    if(!list.contains(arr[i])){
                    list.add(arr[i]);
                    }
                }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 3, 2, 2, 2 };
        System.out.println(findMajority(arr));
    }
}