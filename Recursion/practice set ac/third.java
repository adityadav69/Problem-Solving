public class third {

    static int length(String s,int i,int count){
        if(i==s.length()){
            return count;
        }
        count=count+1;
        return length(s, i+1, count);
    }
    public static void main(String[] args) {
        System.out.println(length("aditya yadav", 0, 0));
    }
}
