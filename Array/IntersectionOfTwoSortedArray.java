import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {

    static void insersection(int arr1[],int arr2[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while (i!=arr1.length && j!=arr2.length) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

       System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,3,4,4,5,6};
        int arr2[]={2,3,4,4,5,6};
        insersection(arr1, arr2);
    }
}
