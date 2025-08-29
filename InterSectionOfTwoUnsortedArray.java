import java.util.ArrayList;

public class InterSectionOfTwoUnsortedArray {

    static void intersection(int arr[],int arr2[]){
        ArrayList <Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j] && !ans.contains(arr[i])){
                    ans.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={3,4,2,5,6,5,6,8};
        int arr2[]={3,5,2,6,4,8,9};
        intersection(arr, arr2);
    }
}
