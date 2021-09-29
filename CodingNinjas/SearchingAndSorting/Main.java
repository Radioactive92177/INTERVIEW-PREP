public class Main{
    public static void main(String[] args) {
        // Calling BinarySearch
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // int x = 6;
        // System.out.println(BinarySearch.search(arr, x));

        // Calling SelectionSort
        int[] arr = {3,2,4,1,5,7,6};
        SelectionSort.sort(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }System.out.println();
    }
}
