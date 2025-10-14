public class third {

    // static int length(String s,int i,int count){
    //     if(i==s.length()){
    //         return count;
    //     }
    //     count=count+1;
    //     return length(s, i+1, count);
    // }
     static int length(String s){
        if(s.length()==0){
            return 0;
        }
        return length(s.substring(1))+1;
    }


    public static void main(String[] args) {
        System.out.println(length("adityayadav"));
    }
}
