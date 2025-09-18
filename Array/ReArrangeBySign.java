import java.util.ArrayList;

public class ReArrangeBySign {

    static void reArrange(int arr[]) {
        // ArrayList <Integer> positive=new ArrayList<>();
        // ArrayList <Integer> negative=new ArrayList<>();

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<0){
        //         negative.add(arr[i]);
        //     }
        //     else{
        //         positive.add(arr[i]);
        //     }
        // }


        // System.out.println(positive);
        // System.out.println(negative);

        // for(int i=0;i<arr.length/2;i++){
        //     arr[i*2]=positive.get(i);
        //     arr[i*2+1]=negative.get(i);
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        int np=1;
        int pp=0;
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr2[np]=arr[i];
                np=np+2;
            }
            else{
                arr2[pp]=arr[i];
                pp+=2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        reArrange(arr);

    }
}
