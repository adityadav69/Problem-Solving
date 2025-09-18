public class MissingNumber {
    static int missingNum(int arr[]) {
        int n=arr.length;
        int number=0;
        for(int i=0;i<n;i++){
            number++;
            if(arr[i]==number){
                continue;
            }
            else{
                return number;
            }
        }
        
        return number;
        
    }

    public static void main(String[] args) {
        int arr[]=new int[2];
        arr[0]=1;
        System.out.println(missingNum(arr));
    }
}
