public class FindNumberOfDigit{

    static int countDigits(int num) {
        int n=num;
        int count=0;
        while(n>0){
            int last=n%10;
            n=n/10;
            if(last==0){
                continue;
            }
            if(num%last==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num=234;
        System.out.println(countDigits(num));
    }
}