public class second {

    static void print(StringBuilder ans,String s[],int num){
        if(num<=0){
            System.out.println(ans);
            return;
        }
        int digit=num%10;
        // ans=s[digit]+" "+ans;
        ans.insert(0,s[digit]+" "); 
        // System.out.println(sb.toString());
        num=num/10;
        print(ans, s, num);

    }
    public static void main(String[] args) {
        String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        print(new StringBuilder(), s, 1947); 

        
    }
}
