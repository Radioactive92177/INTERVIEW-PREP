import java.util.HashSet;

public class FindUnionAndInterSec{
    static int[] findUnion(int[] arr1, int[] arr2){
        HashSet <Integer> union = new HashSet<>();

        for(int elem : arr1){
            union.add(elem);
        }

        for(int elem : arr2){
            if(!union.contains(elem)){
                union.add(elem);
            }
        }

        int[] output = new int[union.size()];

        int index = 0;
        for(int elem : union){
            output[index] = elem;
            index += 1;
        }

        return output;
    }

    static int[] findIntersec(int[] arr1, int[] arr2){
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> intersection = new HashSet<>();

        for(int elem : arr1){
            set.add(elem);
        }

        for(int elem : arr2){
            if(set.contains(elem)){
                intersection.add(elem);
            }
        }

        int[] output = new int[intersection.size()];

        int index = 0;
        for(int elem : intersection){
            output[index] = elem;
            index += 1;
        }

        return output;
    }
}
