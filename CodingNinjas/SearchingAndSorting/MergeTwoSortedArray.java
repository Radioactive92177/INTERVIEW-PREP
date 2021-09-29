public class MergeTwoSortedArray{
    static int[] merge(int[] arr1, int[] arr2){
        int[] output = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                output[k] = arr1[i];
                i += 1;
            } else {
                output[k] = arr2[j];
                j += 1;
            }
            k += 1;
        }

        while(i < arr1.length){
            output[k] = arr1[i];
            i += 1;
            k += 1;
        }

        while(j < arr2.length){
            output[k] = arr2[j];
            j += 1;
            k += 1;
        }
        return output;
    }
}
