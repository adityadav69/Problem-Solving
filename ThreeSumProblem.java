import java.util.*;

public class ThreeSumProblem {

    static List<List<Integer>> find(int arr[]) {
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Set<ArrayList<Integer>> set = new HashSet<>();

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         for (int k = j + 1; k < arr.length; k++) {
        //             if (arr[i] + arr[j] + arr[k] == 0) {
        //                 ArrayList<Integer> triplet = new ArrayList<>();
        //                 triplet.add(arr[i]);
        //                 triplet.add(arr[j]);
        //                 triplet.add(arr[k]);
        //                 Collections.sort(triplet); // sort to avoid duplicates
        //                 set.add(triplet);
        //             }
        //         }
        //     }
        // }

        // list.addAll(set);
        List<List<Integer>> list =new ArrayList<>();
          Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List <Integer> triplet=new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(arr[k]);
                    list.add(triplet);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(j<k && arr[k]==arr[k+1])k--;
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(find(arr));
       
    }
}
