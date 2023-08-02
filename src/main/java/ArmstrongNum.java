import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 Digit number");
        int n = scanner.nextInt();
        int rem, add = 0;
        int c = n;
        while (n > 0) {
            rem = n % 10;
            add = (rem * rem * rem) + add;
            n = n / 10;
        }
        if (c == add)
        {
            System.out.println(" is Armstrong number");
        } else
        {
            System.out.println(" is not Armstrong number ");
        }
    }
    }

