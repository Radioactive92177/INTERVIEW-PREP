public class MinLenWord{
    static String getMin(String str){
        str = str.trim();

        int startIndex = -1, endIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        while(endIndex < str.length()){
            if(str.charAt(endIndex) == ' '){
                int len = endIndex - startIndex;
                if(len < min){
                    min = len;
                    minIndex = startIndex;
                }
                startIndex = endIndex;
            }
            endIndex += 1;
        }

        return str.substring(minIndex, min);
    }
}
