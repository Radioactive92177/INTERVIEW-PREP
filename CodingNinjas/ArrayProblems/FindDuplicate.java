public class FindDuplicate {
    static int find(int[] arr){
        int extent = arr.length - 1;
        int sumOfNaturalN = (extent * (extent - 1))/2;
        int sumOfElems = 0;

        for(int index = 0; index < arr.length; index ++){
            sumOfElems += arr[index];
        }

        return sumOfElems - sumOfNaturalN;
    }
}
