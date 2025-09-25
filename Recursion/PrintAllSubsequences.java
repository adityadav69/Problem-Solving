import java.util.ArrayList;

public class PrintAllSubsequences {

    static void printAll(int arr[],int i,ArrayList<Integer>list){
        if(i==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printAll(arr, i+1, list);
        list.removeLast();
        printAll(arr, i+1, list);
    }

    public static void main(String[] args) {
        int arr[]={3,1,2};
        printAll(arr, 0, new ArrayList<>());
    }
}