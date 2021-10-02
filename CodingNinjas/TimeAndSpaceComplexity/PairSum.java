import java.util.Arrays;

public class PairSum{
    static int[] getPair(int[] arr, int sum){
        int compliment = 0;
        int[] pair = new int[2];

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                compliment = sum - arr[i];

                if(arr[j] == compliment){
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                }
            }
        }

        return pair;
    }
}
