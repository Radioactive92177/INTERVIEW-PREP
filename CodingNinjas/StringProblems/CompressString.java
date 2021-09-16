public class CompressString {
    static String compress(String str) {
        String output = "" + str.charAt(0);

        int count = 0;
        char temp = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            count += 1;
            if (temp != str.charAt(i)) {
                output = count > 1 ? output + count + str.charAt(i) : output + str.charAt(i);
                temp = str.charAt(i);
                count = 0;
            }
        }

        return count > 1 ? output + (count + 1) : output;
    }
}
