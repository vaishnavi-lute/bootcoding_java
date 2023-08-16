import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = scanner.nextInt();
        int a = 0;
        for(int i=1;i<=range;i++){
            a= a * 10 + 9;
        }
        int b = a;
        int sum = 0;
        while (b != 0) {
            sum = sum + b;
            b = b / 10;
        }
        System.out.println("Total of the series is : "+ sum);
    }

}


