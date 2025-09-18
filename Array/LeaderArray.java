import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeaderArray{

    static void findLeader(int arr[]){
        ArrayList <Integer> list=new ArrayList();
        int max=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        findLeader(arr);
        
    }
}