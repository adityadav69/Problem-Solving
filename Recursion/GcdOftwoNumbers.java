public class GcdOftwoNumbers {


    static int find(int num1,int num2){
           if(num2==0){
            return num1;
        }
        return find(num2,num1%num2);
        // int largest=1;
        // // for(int i=1;i<=num1;i++){
        // //     if(num1%i==0 && num2%i==0){
        // //         largest=i;
        // //     }
        // // }
        // for(int i=num1;i>=2;i--){
        //     if(num1%i==0 && num2%i==0){
        //         return largest=i;
        //     }
        // }
        // return largest;
        // // if(i==num1+1){
        // //     return largest; 
        // // }
        // // if(num1%i==0 && num2%i==0){
        // //     largest=i;
        // // }
        // // return find(num1, num2, i+1);

        // int first=num2;
        // int second=num1;
        // while (second!=0) {
        //     first=second; 
        //     second=first%second;
        // }
        // return first;

     

    }
    public static void main(String[] args) {
        System.out.println(find(18, 36));
    }
}
