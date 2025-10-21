import java.util.ArrayList;

public class MergeTwoSortedArray {

    static ArrayList<Integer> merge(int arr1[],int arr2[]){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        int m=arr1.length;
        int n=arr2.length;
        while (i!=m && j!=n) {
            if(arr1[i]<=arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else{
                list.add(arr2[j]);
                j++;
            }
        }

        while (i!=m) {
            
                list.add(arr1[i]);
                i++;
        }
         while (j!=n) {
                list.add(arr2[j]);
                j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6};
        int arr2[]={3,4,9};
        System.out.println(merge(arr, arr2));
    }
}
