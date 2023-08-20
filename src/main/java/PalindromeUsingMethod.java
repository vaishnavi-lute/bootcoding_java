public class PalindromeUsingMethod {
    public static void main(String[] args) {
        Palindrome(141);
    }

    public static void Palindrome(int num) {
        int temp = num;
        int reverse = 0;
        int rem = 0;
        while (temp != 0) {
            rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp = temp / 10;
        }
        if (reverse == num) {
            System.out.println(num + "  is palindrome no");
        } else {
            System.out.println(num + "  is not palindrome no");
        }
    }
}