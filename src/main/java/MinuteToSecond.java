import java.util.Scanner;

public class MinuteToSecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Minute");
        int sec= sc.nextInt();
        convertToSecond(sec);
    }
    public static void convertToSecond(int minute){
        System.out.println(minute + "sec = " + minute * 60 + " second");
    }
}
