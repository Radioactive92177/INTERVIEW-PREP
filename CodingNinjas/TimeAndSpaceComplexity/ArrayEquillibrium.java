public class ArrayEquillibrium{
    static int get(int[] arr){
        int sumOfEl = 0;

        for (int elem : arr) {
            sumOfEl += elem;
        }

        int extent = (int) sumOfEl/2;
        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){
            leftSum += arr[i];

            if(leftSum == extent){
                return i;
            }
        }
        return -1;
    }
}
