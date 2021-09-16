public class RemoveCharacter {
    static String remove(String str, char x){
        String output = "";
        
        for(int i = 0; i<str.length() - 1; i++){
            if(str.charAt(i) != x){
                output += str.charAt(i);
            }
        }

        return output;
    }
}
