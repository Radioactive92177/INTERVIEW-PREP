public class ReverseStringWordWise {
    static String reverse(String str){
        String output = "";

        for(int i = 0; i< str.length(); i++){
            output = str.charAt(i) + output;
        }
        output = ReverseEachWord.reverse(output);
        
        return output;
    }
}
