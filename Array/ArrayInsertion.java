public class ArrayInsertion{

    static int insertAtPosition(int arr[],int pos,int ele,int n){

        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=ele;

        return n+1;
    }

    static int deletion(int arr[],int pos,int n){
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }

    public static void main(String[] args) {
        int arr[]=new int[100];
        int n=5;
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        // int result=insertAtPosition(arr, 2, 90, n);
        int result=deletion(arr, 2, n);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }

    }
}