public class CountVowels {

    static int recurCount(String s, int i,int countV){
        if(i==s.length()){
            return countV;
        }

        if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'|| s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            countV=countV+1;
        }
        return recurCount(s, i+1, countV);


    }
    static int count(String s){
        int countV=0;
        int i=0;
        return recurCount(s, i,countV);
    }
    public static void main(String[] args) {
        String s="aiueotmnsw";
        System.out.println(count(s));
        System.out.println(s.length()-count(s));
      
    }
}
