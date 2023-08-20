import java.util.Scanner;

public class HourToMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour:");
        int hr= sc.nextInt();
        convertToMinute(hr);
    }
    public static void convertToMinute(int hour){
        System.out.println(hour + " hr =" + hour * 60 + " minute");
    }
}