import java.util.HashMap;
import java.util.Map;

public class PairSum {
    static int getPair(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int index = 0; index <= arr.length - 1; index++) {
            int compliment = target - arr[index];
            if (freq.containsKey(compliment)) {
                System.out.print(arr[index] + " " + compliment + "\n");
                count += 1;
            }
            freq.put(arr[index], index);
        }
        return count;
    }
}
