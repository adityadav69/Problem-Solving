public class PowerXtoN {

    static int cp(int n,int i){
        if(i==1){
            return n;
        }
        return n*cp(n, i-1);
    }
    public static void main(String[] args) {
        System.out.println(cp(3,4));

    }
}
