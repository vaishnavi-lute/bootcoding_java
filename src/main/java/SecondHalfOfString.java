public class SecondHalfOfString {
    public static void main(String[] args) {
        String input = "vaishnavi";
        char[] chars2 = input.toCharArray();
        int n= chars2.length;
        int str=0;
        str = n/2;
        String Substring = input.substring(str,n);
        System.out.println("print second half of given string: " + Substring);
    }
}
