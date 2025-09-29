public class RemoveDuplicateString {
    static boolean map[] = new boolean[26];
    // static void unique(String s, String ans, int i) {
    //     if (i == s.length()) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     if (map[s.charAt(i) - 'a'] == false) {
    //         map[s.charAt(i) - 'a'] = true;
    //         ans = ans + s.charAt(i);
    //         unique(s, ans, i + 1);
    //     } else {
    //         unique(s, ans, i + 1);
    //     }
    // }

    static void unique(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (map[s.charAt(i) - 'a'] == false) {
            map[s.charAt(i) - 'a'] = true;
            ans = ans + s.charAt(i);
            unique(s, ans, i + 1);
        } else {
            unique(s, ans, i + 1);
        }
    }

    

    public static void main(String[] args) {
        String s = "afdsansafsdfv";
        unique(s, "", 0);
    }
}
