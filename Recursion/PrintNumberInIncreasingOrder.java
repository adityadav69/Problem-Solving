public class PrintNumberInIncreasingOrder {

    static void printNumber(int i,int n){
        if(i==n){
            System.out.print(i);
            return;
        }
        System.out.print(i+" , ");
        printNumber(i+1, n);
    }
    public static void main(String[] args) {
        printNumber(0, 10);
    }
}
