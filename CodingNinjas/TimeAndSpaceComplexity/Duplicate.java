public class Duplicate{
    static int find(int[] arr){
        int sumArr = 0;

        for(int elem : arr){
            sumArr += elem;
        }
        int n = arr.length - 1;
        int sumOfN = n * ((n + 1) / 2);

        return sumArr - sumOfN;
    }
}
