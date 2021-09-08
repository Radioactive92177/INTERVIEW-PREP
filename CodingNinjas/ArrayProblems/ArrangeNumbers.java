public class ArrangeNumbers {
    static int[] arrange(int extent) {
        int gen = 1, beg = 0, end = extent - 1;
        int[] arr = new int[extent];

        for (int index = 0; index < extent; index++) {
            if (gen % 2 == 0) {
                arr[end] = gen;
                end -= 1;
            } else if (gen % 2 != 0) {
                arr[beg] = gen;
                beg += 1;
            }
            gen += 1;
        }

        return arr;
    }
}
