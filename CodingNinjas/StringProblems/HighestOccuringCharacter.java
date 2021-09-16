public class HighestOccuringCharacter {
    static char getHighest(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)] += 1;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxIndex = i;
            }
        }
        
        return (char) maxIndex;
    }
}
