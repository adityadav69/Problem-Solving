public class TrappingRainwater {

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int countTrappingRainWater(int arr[]){

        int leftMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        int rightMax[]=new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=leftMax[i-1]){
                leftMax[i]=arr[i];
            }
            else{
                leftMax[i]=leftMax[i-1];
            }
        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=rightMax[i+1]){
                rightMax[i]=arr[i];
            }
            else{
                rightMax[i]=rightMax[i+1];
            }
        }
        print(leftMax);
        System.out.println("right max");
        print(rightMax);

        int count=0;
        for(int i=0;i<arr.length;i++){
            int trappedWater=Math.min(leftMax[i],rightMax[i])-arr[i];
            count=count+trappedWater;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(countTrappingRainWater(arr));
    }
}
