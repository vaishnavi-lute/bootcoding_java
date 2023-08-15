import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number");
        double n= scanner.nextDouble();
        int num = 5;
        double result = 0.0;
        System.out.println("The harmonic series is: ");
        while (num > 0) {
        result = result + (double)1 / num;
        num--;
        System.out.print(result + ", ");
    }
  }
}