public class SelectionSort{
    // Helper function to find minIndex
    private static int getMinIndex(int[] arr, int start, int end){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        while(start <= end){
            if(arr[start] < min){
                min = arr[start];
                minIndex = start;
            }
            start += 1;
        }
        return minIndex;
    }

    static void sort(int[] arr){
         for(int i = 0; i < arr.length; i++){
             int minIndex = getMinIndex(arr, i, arr.length - 1);

             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
         }
    }
}
