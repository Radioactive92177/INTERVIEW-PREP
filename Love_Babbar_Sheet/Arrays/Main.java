public class Main{
    public static void main(String[] args) {
        // Calling ReverseArray
        int[] arr = {1,2,3,4,5,6,7,8};
        ReverseArray.reverse(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }System.out.println();
    }
}
