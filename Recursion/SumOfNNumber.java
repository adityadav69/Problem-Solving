public class SumOfNNumber {

    static int sumofN(int n){
        if(n==1){
            return 1;
        }
        int sum=n+sumofN(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofN(5));
    }
}
