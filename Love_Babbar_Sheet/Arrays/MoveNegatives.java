public class MoveNegatives{
    static void move(int[] arr){
        int negIndex = 0;
        int travIndex = 0;

        while(travIndex <= arr.length - 1){
            if(arr[travIndex] < 0){
                int temp = arr[travIndex];
                arr[travIndex] = arr[negIndex];
                arr[negIndex] = temp;

                negIndex += 1;
            }
            travIndex += 1;
        }
    }
}
