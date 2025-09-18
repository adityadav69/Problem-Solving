public class RemoveDuplicates {
    static int remove(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
            return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4}; //Array must be in sorted order
        int size=remove(arr);
        System.out.println("Number of distinct element is "+size);
        System.out.println("After Removing all duplicates element from the sorted array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
