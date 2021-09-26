public class Main{
    public static void main(String[] args) {
        // Calling ReverseArray
        // int[] arr = {1,2,3,4,5,6,7,8};
        // ReverseArray.reverse(arr);
        //
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling FindMaxMin
        // int[] arr = {1,2,3,4,5,6,7,8};
        // System.out.println(FindMaxMin.find(arr)[0] + " " + FindMaxMin.find(arr)[1]);

        // Calling Sort012
        int[] arr = {2,1,0,0,1,0,2};
        Sort012.sort(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }System.out.println();
    }
}
