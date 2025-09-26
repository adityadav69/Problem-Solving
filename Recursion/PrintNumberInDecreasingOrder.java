public class PrintNumberInDecreasingOrder {
    static void printNumber(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" , ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        printNumber(10);
    }
}
