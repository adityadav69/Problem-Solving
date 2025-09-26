public class Factorial_recursion {

    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
