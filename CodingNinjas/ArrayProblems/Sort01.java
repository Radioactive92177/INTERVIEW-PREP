public class Sort01 {
    static void sort(int[] arr) {
        int swapIndex = 0;
        int travIndex = 0;

        while (travIndex <= arr.length - 1) {
            if (arr[travIndex] == 0) {
                int temp = arr[travIndex];
                arr[travIndex] = arr[swapIndex];
                arr[swapIndex] = temp;

                swapIndex += 1;
            }
            travIndex += 1;
        }

    }
}
