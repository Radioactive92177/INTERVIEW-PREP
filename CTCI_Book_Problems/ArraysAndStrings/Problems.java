public class Problems {

    // Problem 1.2
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] marks = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            int index = (int) str1.charAt(i);
            marks[index] += 1;
        }

        for (int j = 0; j < str2.length(); j++) {
            int index = (int) str2.charAt(j);
            marks[index] -= 1;
        }

        for (int mark : marks) {
            if (mark != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "TAP";
        String str2 = "RAT";

        System.out.println(checkPermutation(str1, str2));
    }
}