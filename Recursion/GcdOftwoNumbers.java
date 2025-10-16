public class GcdOftwoNumbers {


    static int find(int num1,int num2){
        //    if(num2==0){
        //     return num1;
        // }
        // return find(num2,num1%num2);

        while (num2!=0) {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;

    }
    public static void main(String[] args) {
        System.out.println(find(20, 36));
    }
}
