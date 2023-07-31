import java.util.Scanner;

public class StarPatternOfPyramidNum {
    //    1
    //   2 3
    //  4 5 6
    // 7 8 9 10
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        int i , j;
        int s=0;
        int b=1;
        for (i = 1; i <= n; i++) // row
        {
            for (s= 1; s<=n-i; s++)//space
            {
                System.out.print(" ");
            }
            for (j= 1; j<=i*2-1; j++) //column
            {
                System.out.print(b++);
            }
            System.out.println();
        }
    }
}
