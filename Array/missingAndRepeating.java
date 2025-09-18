import java.util.ArrayList;

public class missingAndRepeating {
    
    //HashArray method
    // static ArrayList<Integer> FindMissing(int arr[]){
    //     ArrayList<Integer> ans=new ArrayList<>();
    //     int arr2[]=new int[arr.length+1];
    //     for(int i=0;i<arr.length;i++){
    //         arr2[arr[i]]++;
    //     }
    //     int missing=-1;
    //     int repeating=-1;
    //     for(int i=0;i<arr2.length;i++){
    //         if(arr2[i]==2){
    //             repeating=i;
    //         }
    //         else if(arr2[i]==0){
    //             missing=i;
    //         }
    //     }
    //     ans.add(repeating);
    //     ans.add(missing);
    //     return ans;
    // }

    static ArrayList<Integer> FindMissing(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();

        long n=arr.length;

        long sn=n*(n+1)/2;
        long sn2=n*(n+1)*((2*n)+1)/6;

        long s=0;
        long s2=0;
        for(int i=0;i<arr.length;i++){
            s=s+(long)arr[i];
            s2=s2+(long)arr[i]*(long)arr[i];
        }
        long val1=s-sn;
        long val2=s2-sn2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        x=(int)x;
        y=(int)y;
        ans.add((int)x);
        ans.add((int)y);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,4,6};
        System.out.println(FindMissing(arr));
    }
}
