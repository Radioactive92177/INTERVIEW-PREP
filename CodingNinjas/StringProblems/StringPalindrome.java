public class StringPalindrome {
    static boolean check(String str) {
        int beg = 0, end = str.length() - 1;
        str = str.toLowerCase();
        
        while (beg <= end) {
            if (str.charAt(beg) != str.charAt(end)) {
                return false;
            }
            beg += 1;
            end -= 1;
        }
        return true;
    }
}
