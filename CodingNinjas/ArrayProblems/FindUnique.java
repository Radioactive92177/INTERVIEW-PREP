public class FindUnique {
    static int getUnique(int[] arr) {
        int unique = 0;

        for (int index = 0; index < arr.length; index++) {
            unique ^= arr[index];
        }

        return unique;
    }
}
