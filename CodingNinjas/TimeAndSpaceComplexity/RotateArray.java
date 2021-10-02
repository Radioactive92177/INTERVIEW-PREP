public class RotateArray{
    private static void reverseArr(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start += 1;
            end -= 1;
        }
    }

    static void rotate(int[] arr, int n){
        reverseArr(arr, 0, n-1);
        reverseArr(arr, n+1, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }
}
