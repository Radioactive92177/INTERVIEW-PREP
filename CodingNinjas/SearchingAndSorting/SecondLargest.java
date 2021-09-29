public class SecondLargest{
    static int getNum(int[] arr){
        if(arr.length <= 1){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                secLargest = largest;
                largest = arr[i];
            }
        }

        return secLargest;
    }
}
