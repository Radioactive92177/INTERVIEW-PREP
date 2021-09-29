public class BinarySearch{
    static int search(int[] arr, int x){
        if(arr.length <= 1){
            return arr[0] == x ? 0 : -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == x){
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
