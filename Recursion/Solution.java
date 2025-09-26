import java.util.ArrayList;

public class Solution {

    // static ArrayList<Integer> find(int arr[], int key) {
    // // code here
    // ArrayList<Integer> ans=new ArrayList<>();
    // ArrayList<Integer> list=new ArrayList<>();
    // ans.add(-1);
    // ans.add(-1);

    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==key){
    // list.add(i);
    // }
    // }

    // if(list.size()==1){
    // ans.clear();
    // ans.add(list.get(0));
    // ans.add(list.get(0));
    // }
    // else if(list.size()>=2){
    // ans.clear();
    // ans.add(list.get(0));
    // ans.add(list.get(list.size()-1));
    // }

    // return ans;
    // }
    static ArrayList<Integer> find(int arr[], int key) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        int last = -1;
        int first = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key && first == -1) {
                first = i;
            }
            if (arr[i] == key) {
                last = i;
            }
        }
        System.out.println("First "+first+" last "+last);
        if (first != -1 && last != -1) {
            ans.clear();
            ans.add(first);
            ans.add(last);
            return ans;
        } else {
            return ans;
        }

    }

    public static void main(String[] args) {
        // int arr[]={1 ,3, 5, 5, 5, 5, 67, 123, 125};
        int arr[] = { 6, 6, 6, 6, 7,7,7,8 };
        System.out.println(find(arr, 8));
    }
}
