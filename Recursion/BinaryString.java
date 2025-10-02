public class BinaryString {

    static void printBinary(int n,int last,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        printBinary(n-1, 0, s+"0");
        if(last==0){
            printBinary(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        printBinary(3, 0, "");
    }
}
