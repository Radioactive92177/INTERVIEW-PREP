public class FindMaxMin{
    static int[] find(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int elem : arr){
            if(elem > max){
                max = elem;
            }
            if(elem < min){
                min = elem;
            }
        }

        return new int[] {max, min};
    }
}
