public class LinearSearch {
    static int search(int[] arr, int target) {
        int index = 0;

        while (index < arr.length) {
            if (arr[index] == target) {
                return index;
            }
            index += 1;
        }
        
        return -1;
    }
}
