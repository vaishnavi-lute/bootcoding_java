import java.util.Scanner;

public class StarPatternOfNum3 {
    public static void main(String[] args) {
       int n=5;
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + 1 + j);
            }
            System.out.println();

        }
    }
}