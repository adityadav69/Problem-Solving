public class UniqueElementInUnsortedArray {

    static int unique(int arr[]){
        //Brute force apporach
        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return arr[i];
        //     }
        // }
        // return 0;
        //XOR operator = same 0 and different me element

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={2,2,4,3,5,4,5};
        System.out.println(unique(arr));
    }
}
