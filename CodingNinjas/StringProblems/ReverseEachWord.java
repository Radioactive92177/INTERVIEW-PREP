public class ReverseEachWord {

    private static String swap(String str, int beg, int end) {
        String reverse = "";
        while (beg <= end) {
            reverse = str.charAt(beg) + reverse;
            beg += 1;
        }
        return reverse;
    }

    static String reverse(String str) {
        String output = "";

        int prev = -1;
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                output += swap(str, prev + 1, i - 1) + " ";
                prev = i;
            }
            i += 1;
        }

        output += swap(str, prev + 1, str.length() - 1);

        return output;
    }
}
