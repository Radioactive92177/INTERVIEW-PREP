public class FindDuplicate{
    static int MAX = 256;

    static String find(String str){
        int[] freq = new int[MAX];

        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)] += 1;
        }

        String output = "";

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                output += (char) i;
            }
        }

        return output;
    }
}
