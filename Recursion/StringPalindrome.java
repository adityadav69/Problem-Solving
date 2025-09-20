public class StringPalindrome {

    static boolean checkPalindrome(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        } else {
            return checkPalindrome(s, i + 1);
            
        }

    }

    public static void main(String[] args) {
        String s = "racecar";

        System.out.println(checkPalindrome(s, 0));
    }
}