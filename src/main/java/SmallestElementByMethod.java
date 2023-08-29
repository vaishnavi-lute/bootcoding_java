import java.util.Scanner;

public class SmallestElementByMethod {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Minimum(a,b,c);
    }
    public static void Minimum(int a,int b,int c){
        if(a<b && a<c)
       {
           System.out.println(a +" is Minimum Number");

        }if(b<a && b<c)
        {
            System.out.println(b + "is Minimum Number");
        }
        if(c<a && c<b){
            System.out.println(c +" is Minimum Number");
        }
    }

}
