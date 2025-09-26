public class firstOccurence {

    static int fo(int i,int arr[],int key){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        else{
            return fo(i+1,arr,key);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,31,6,9,5,10,2,5,3};
        System.out.println(fo(0, arr, 3));
    }
}
