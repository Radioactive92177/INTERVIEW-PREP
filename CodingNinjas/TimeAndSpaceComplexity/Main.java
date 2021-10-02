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
        // int[] arr = {1,2,3,4,5,6,7};
        // int n = 2;
        //
        // RotateArray.rotate(arr, n);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling UniqueElement
        // int[] arr = {2,3,2,4,5,5,4};
        // System.out.println(UniqueElement.find(arr));

        // Calling Duplicate
        // int[] arr = {1,2,3,4,5,6,7,7};
        // System.out.println(Duplicate.find(arr));

        // Calling PairSum
        int[] arr = {1,2,3,4,5};
        int sum = 5;
        int[] output = PairSum.getPair(arr, sum);

        for(int elem : output){
            System.out.print(elem + " ");
        }System.out.println();
    }
}
