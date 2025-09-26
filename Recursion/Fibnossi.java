public class Fibnossi {

    static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
