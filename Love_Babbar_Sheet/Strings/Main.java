public class Main{
    public static void main(String[] args) {
        // Calling ReverseString
        // char[] str = {'h','e','l','l','o'};
        // ReverseString.reverse(str);
        //
        // for(char elem : str){
        //     System.out.print(elem + " ");
        // }System.out.println();

        // Calling PalindromeString
        // String str = "abba";
        // System.out.println(PalindromeString.check(str));

        // Calling FindDuplicate
        // String str = "abbccd";
        // System.out.println(FindDuplicate.find(str));

        // Calling CheckRotationOfStrings
        String str1 = "abcd";
        String str2 = "cdcb";

        System.out.println(CheckRotationOfStrings.check(str1, str2));
    }
}
