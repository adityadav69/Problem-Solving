public class Hello {

    static void find(String s) {
        String ans = "";

        ans += Character.toUpperCase(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' && i + 1 < s.length()) {
                ans += ch;
                ans += Character.toUpperCase(s.charAt(i + 1));
                i++;
            } else {
                ans += ch;
            }
        }

        System.out.println(ans);
    }

    public static void main(String args[]) {
        String s = "aditya yadav";
        // String s1="afdsa";
        // System.out.println(s1.toUpperCase());
        // print(s);
        find(s);
    }
}