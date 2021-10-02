import java.util.Arrays;

public class UniqueElement{
    static int find(int[] arr){
        Arrays.sort(arr);
        int unique = 0;

        for(int i = 0; i < arr.length; i++){
            unique ^= arr[i];
        }
        return unique;
    }
}
