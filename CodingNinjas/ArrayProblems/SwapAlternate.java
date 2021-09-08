public class SwapAlternate {
    static void swap(int[] arr) {
        for (int index = 0; index < arr.length - 1; index += 2) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
    }
}
