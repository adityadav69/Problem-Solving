public class LongestPrefix {

    static void longestPrefix(String arr[]) {
        String val1 = arr[0];
        String val2 = arr[1];
        String val3 = arr[2];

        int length = Math.min(val1.length(), val2.length());
        length = Math.min(length, val3.length());
        System.out.println(length);

        int i = 0;
         String longest="";
        while (i < length) {
            if (val1.charAt(i) == val2.charAt(i) && val2.charAt(i) == val3.charAt(i)) {
                longest=longest+val1.charAt(i);
                i++;
            } else {
                break; // yahan return nahi break
            }
        }

        for(int j=0;j<arr.length;j++){
            
        }

        System.out.println(longest);
    }

    public static void main(String[] args) {
        String arr[] = { "dog", "racecar", "car" };
        longestPrefix(arr);
    }
}
