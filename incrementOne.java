public class incrementOne {
      public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0; // carry aage badhao
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int result[]=plusOne(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
