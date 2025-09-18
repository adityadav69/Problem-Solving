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


    // static ArrayList<Integer> findMajority(int arr[]){
    //     ArrayList <Integer> list=new ArrayList<>();
    //     HashMap <Integer,Integer> hm =new HashMap<>();
        
    //     for(int i=0;i<arr.length;i++){
    //         if(hm.containsKey(arr[i])){
    //              hm.put(arr[i], hm.get(arr[i]) + 1);
    //         }
    //         else{
    //             hm.put(arr[i], 1);
    //         }

    //         if(hm.get(arr[i])>arr.length/3){
    //                 if(!list.contains(arr[i])){
    //                 list.add(arr[i]);
    //                 }
    //             }
    //     }
    //     return list;
    // }
    static ArrayList <Integer> findMajority(int arr[]){

      ArrayList <Integer> list=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(cnt1==0 && arr[i]!=el2){
                el1=arr[i];
                cnt1=1;
            }
            else if(cnt2==0 && arr[i]!=el1){
                el2=arr[i];
                cnt2=1;
            }
            else if(arr[i]==el1) cnt1++;
            else if(arr[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==el1){
                count1++;
            }
          
            else if(arr[i]==el2){
                count2++;
            }
        }
        System.out.println(count1+" count1  count2  "+count2);
        if(count1>arr.length/3){
            System.out.println("isme aaya");
            list.add(el1);
        }
        if(count2>arr.length/3){
            System.out.println("isme nahi aaya");
            list.add(el2);
        }


        return list;

    }

    public static void main(String[] args) {
        int arr[] = { 1,2};
        System.out.println(findMajority(arr));
    }
}