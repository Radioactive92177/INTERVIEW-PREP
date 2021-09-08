public class ArraySum {
    public static int getSum(int[] arr) {
        int index = 0, sum = 0;

        while (index <= arr.length - 1) {
            sum += arr[index];
            index += 1;
        }

        return sum;
    }
}