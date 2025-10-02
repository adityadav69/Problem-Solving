public class FreindParingProblem {

    static int countPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=countPair(n-1);
        int pair=countPair(n-2);
        int pairWays=(n-1)*pair;
        return single+pairWays;
    }
    public static void main(String[]  args) {
        System.out.println(countPair(4));

    }
}
