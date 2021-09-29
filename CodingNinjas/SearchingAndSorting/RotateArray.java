public class RotateArray{
    // Helper function to reverse the array
    private static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start += 1;
            end -= 1;
        }
    }

    static void rotate(int[] arr, int n){
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
}
