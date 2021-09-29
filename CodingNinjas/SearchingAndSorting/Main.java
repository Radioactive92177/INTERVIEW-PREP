public class Main{
    public static void main(String[] args) {
        // Calling BinarySearch
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // int x = 6;
        // System.out.println(BinarySearch.search(arr, x));

        // Calling SelectionSort
        // int[] arr = {3,2,4,1,5,7,6};
        // SelectionSort.sort(arr);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling BubbleSort
        // int[] arr = {3,2,4,1,5,7,6};
        // BubbleSort.sort(arr);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling InsertionSort
        // int[] arr = {3,2,4,1,5,7,6};
        // InsertionSort.sort(arr);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling MergeTwoSortedArray
        // int[] arr1 = {1,2,3};
        // int[] arr2 = {1,2,4,5};
        // int[] output = MergeTwoSortedArray.merge(arr1, arr2);
        //
        // for (int elem : output) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling PushZeroes
        // int[] arr = {1,0,2,5,0,4,0,6};
        // PushZeroes.push(arr);
        //
        // for(int elem : arr){
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling RotateArray
        // int[] arr = {1,2,3,4,5};
        // RotateArray.rotate(arr, 2);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling SecondLargest
        // int[] arr = {1,6,3,2,7,5,4};
        // System.out.println(SecondLargest.getNum(arr));

        // Calling CheckRotation
        // int[] arr = {5,6,1,2,3,4};
        // System.out.println(CheckRotation.getIndex(arr));

        // Calling Sort012
        // int[] arr = {0,1,0,2,0,1,0,2};
        // Sort012.sort(arr);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling SumOfTwoArray
        int[] arr1 = {8,5,2};
        int[] arr2 = {1,3};
        int[] ans = SumOfTwoArray.getSum(arr1, arr2);

        for (int elem : ans) {
            System.out.print(elem + " ");
        }System.out.println();
    }
}
