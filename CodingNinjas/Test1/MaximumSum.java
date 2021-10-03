public class MaximumSum{
    static int getSum(int[] arr1, int[] arr2){
        int index1 = 0, index2 = 0;
        int sum1 = 0, sum2 = 0;
        int len1 = arr1.length, len2 = arr2.length;
        int result = 0;

        while(index1 < len1 && index2 < len2){
            if(arr1[index1] < arr2[index2]){
                sum1 += arr1[index1];
                index1 += 1;
            } else if(arr2[index2] < arr1[index1]){
                sum2 += arr2[index2];
                index2 += 1;
            } else {
                result += sum1 > sum2 ? sum1 : sum2;
                sum1 = sum2 = 0;

                while(index1 < len1 && index2 < len2 && arr1[index1] == arr2[index2]){
                    result += arr1[index1];
                    index1 += 1;
                    index2 += 2;
                }
            }
        }

        while(index1 < len1){
            sum1 += arr1[index1];
            index1 += 1;
        }

        while(index2 < len2){
            sum2 += arr2[index2];
            index2 += 1;
        }
        
        result += sum1 > sum2 ? sum1 : sum2;
        return result;
    }
}
