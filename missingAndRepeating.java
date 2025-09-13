import java.util.ArrayList;

public class missingAndRepeating {
    
    static ArrayList<Integer> FindMissing(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int arr2[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr2[arr[i]]++;
        }
        int missing=-1;
        int repeating=-1;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==2){
                repeating=i;
            }
            else if(arr2[i]==0){
                missing=i;
            }
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,4,6};
        System.out.println(FindMissing(arr));
    }
}
