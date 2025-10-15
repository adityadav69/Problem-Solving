public class TilingProblem {

    static int calculate(int n){
        if(n==1 || n==0){
            return 1;
        }
        //vertical
        int vertical=calculate(n-1);
        //Horizontal
        int horizontal=calculate(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(calculate(6));
        System.out.println(calculate(6));
        System.out.println(calculate(6));
        
    }
}
