public class MaximumProductArray {

    static int findMaxProduct(int arr[]) {
        // int maxProduct = Integer.MIN_VALUE;
        // int product=1;
        // for (int i = 0; i < arr.length; i++) {
        //     product=1;
        //     for (int j = i; j < arr.length; j++) {
        //        product=product* arr[j];
        //         if (product > maxProduct) {
        //             maxProduct = product;
        //         }
        //     }

        // }
        // return maxProduct;
        
        // optimul solution
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<arr.length;i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*arr[(n-1)-i];
            System.out.println("Suffix is "+suffix);
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1,0,-1,2,3,-5,-2 };
        System.out.println(findMaxProduct(arr));
    }
}
