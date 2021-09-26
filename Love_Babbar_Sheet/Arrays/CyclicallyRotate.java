public class CyclicallyRotate{
    private static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start += 1;
            end -= 1;
        }
    }
    
    static void rotate(int[] arr){
        reverse(arr, 0, arr.length - 2);
        reverse(arr, 0, arr.length - 1);
    }
}
