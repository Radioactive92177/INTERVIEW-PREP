public class Main{
    public static void main(String[] args) {
        // Calling ArrayEquillibrium
        // int[] arr = {2,1,3,3,1,2};
        // System.out.println(ArrayEquillibrium.get(arr));

        // Calling ArrayIntersection
        // int[] arr1 = {1,2,3,4,5,6,7};
        // int[] arr2 = {1,4,2,5};
        // ArrayIntersection.printIntersection(arr1, arr2);

        // Calling RotateArray
        int[] arr = {1,2,3,4,5,6,7};
        int n = 2;

        RotateArray.rotate(arr, n);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }System.out.println();
    }
}
