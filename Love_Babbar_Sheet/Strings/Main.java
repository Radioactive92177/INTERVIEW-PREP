public class Main{
    public static void main(String[] args) {
        // Calling ReverseString
        char[] str = {'h','e','l','l','o'};
        ReverseString.reverse(str);

        for(char elem : str){
            System.out.print(elem + " ");
        }System.out.println();
    }
}
