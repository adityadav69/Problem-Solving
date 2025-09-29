public class OptimizedPower {

    static int cp(int n, int i) {
        if (i == 0)
            return 1;

        int half = cp(n, i / 2);

        if (i % 2 == 0) {
            return half * half;
        } else {
            return n * half * half;
        }
    }

    public static void main(String[] args) {
        System.out.println(cp(2, 5));
        System.out.println(cp(2, 5));
        System.out.println(cp(2, 5));
    }
}
