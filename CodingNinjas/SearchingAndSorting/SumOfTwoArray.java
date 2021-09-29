public class SumOfTwoArray{
    static int[] getSum(int[] arr1, int[] arr2){
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int[] ans = new int[Math.max(arr1.length, arr2.length) + 1];
        int carry = 0;
        int k = ans.length - 1;

        while(i >= 0 && j >= 0){
            int sum = arr1[i] + arr2[j] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;

            i -= 1;
            j -= 1;
            k -= 1;
        }

        while(i>=0){
            int sum = arr1[i] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;

            i -= 1;
            k -= 1;
        }

        while(j>=0){
            int sum = arr2[j] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;

            j -= 1;
            k -= 1;
        }
        ans[0] = carry;

        return ans;
    }
}
