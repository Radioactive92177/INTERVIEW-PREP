public class Sort012{
    static void sort(int[] arr){
        int zeroIndex = 0;
        int twoIndex = arr.length - 1;
        int travIndex = 0;

        while(travIndex <= twoIndex){
            if(arr[travIndex] == 0){
                int temp = arr[travIndex];
                arr[travIndex] = arr[zeroIndex];
                arr[zeroIndex] = temp;

                zeroIndex += 1;
                travIndex += 1;
            }else if(arr[travIndex] == 2){
                int temp = arr[travIndex];
                arr[travIndex] = arr[twoIndex];
                arr[twoIndex] = temp;

                twoIndex -= 1;
            }else{
                travIndex += 1;
            }
        }
    }
}
