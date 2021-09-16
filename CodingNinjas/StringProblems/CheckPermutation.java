public class CheckPermutation {
    static boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[(int) str1.charAt(i)] += 1;
            freq[(int) str2.charAt(i)] -= 1;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
