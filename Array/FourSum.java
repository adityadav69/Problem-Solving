import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FourSum {

    // static ArrayList<ArrayList<Integer>> calc(int arr[], int target) {
    //     Set<ArrayList<Integer>> ans = new HashSet<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             for (int k = j + 1; k < arr.length; k++) {
    //                 for (int l = k + 1; l < arr.length; l++) {
    //                     int sum = arr[i];
    //                     sum = sum + arr[j];
    //                     sum = sum + arr[k];
    //                     sum = sum + arr[l];
    //                     if (sum == target) {
    //                         ArrayList<Integer> list=new ArrayList<>();
    //                         list.add(arr[i]);
    //                         list.add(arr[j]);
    //                         list.add(arr[k]);
    //                         list.add(arr[l]);
    //                         Collections.sort(list);
    //                         ans.add(list);
    //                     }
    //                 }
    //             }
    //         }
    //     }

    //     return new ArrayList<>(ans);
    // }

      static ArrayList<ArrayList<Integer>> calc(int arr[], int target) {

       Set <ArrayList<Integer>> ans=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    for(int l=k+1;l<arr.length;l++){
                        int sum=arr[i];
                        sum+=arr[j];
                        sum+=arr[k];
                        sum+=arr[l];
                        if(sum==target){
                        ArrayList<Integer>list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        Collections.sort(list);
                        ans.add(list);
                        }
                    }
                }
            }
        }
        
        return new ArrayList<>(ans);

      }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 2, 1, 1 };
        System.out.println(calc(arr, 3));
    }
}