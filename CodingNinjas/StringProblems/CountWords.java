public class CountWords {
    static int count(String line) {
        int words = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                words += 1;
            }
        }

        return words + 1;
    }
}