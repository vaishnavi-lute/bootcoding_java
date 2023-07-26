import java.util.Scanner;

public class WhileLoopCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        int count=0;
        while(num != 0){
            num = num/10;
            count++;

        }
        System.out.println(count + "  is count of given no.");
    }
}
