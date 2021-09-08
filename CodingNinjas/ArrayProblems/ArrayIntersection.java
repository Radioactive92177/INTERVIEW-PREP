import java.util.HashSet;

public class ArrayIntersection {
    static int[] getIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<Integer>();

        for (int index = 0; index <= arr1.length - 1; index++) {
            set.add(arr1[index]);
        }

        for (int index = 0; index <= arr2.length - 1; index++) {
            if (set.contains(arr2[index])) {
                intersection.add(arr2[index]);
            }
        }

        int[] result = new int[intersection.size()];

        int index = 0;

        for (int elem : intersection) {
            result[index++] = elem;
        }

        return result;
    }
}
