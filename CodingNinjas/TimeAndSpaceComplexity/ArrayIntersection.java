import java.util.Arrays;

public class ArrayIntersection{
    static void printIntersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i += 1;
                j += 1;
            } else if (arr1[i] > arr2[j]){
                j += 1;
            } else{
                i += 1;
            }
        }System.out.println();
    }
}
