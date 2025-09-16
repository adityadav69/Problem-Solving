public class MaximumProductArray {

    static int findMaxProduct(int arr[]) {
        int maxProduct = Integer.MIN_VALUE;
        int product=1;
        for (int i = 0; i < arr.length; i++) {
            product=1;
            for (int j = i; j < arr.length; j++) {
               product=product* arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }

        }
        return maxProduct;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4 };
        System.out.println(findMaxProduct(arr));
    }
}
