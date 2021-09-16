public class RemoveConsecDups {
    static String remove(String str) {
        String output = "";
        char temp = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != temp) {
                output += temp;
                temp = str.charAt(i);
            }
        }
        output += temp;
        
        return output;
    }
}