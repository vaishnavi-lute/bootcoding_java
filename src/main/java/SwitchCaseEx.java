import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter valid Grade :");
        String grade=sc.nextLine();

        switch (grade){
            case "A++":
                System.out.println(" A++ : YOUR PERCENTAGE BETWEEN 90% TO 95%");
                break;
            case "A":
                System.out.println(" A : YOUR PERCENTAGE BETWEEN 85% TO 90%");
                break;
            case "B++":
                System.out.println("B++ :  YOUR PERCENTAGE BETWEEN 80% TO 85%");
                break;
            case "B":
                System.out.println("B :  YOUR PERCENTAGE BETWEEN 75% TO 80%");
                break;
            case "C++":
                System.out.println("C++ :  YOUR PERCENTAGE BETWEEN 70% TO 75%");
                break;
            case "C":
                System.out.println("C :  YOUR PERCENTAGE BETWEEN 65% TO 70%");
                break;
            case "D++":
                System.out.println("D++ :  YOUR PERCENTAGE BETWEEN 60% TO 65%");
                break;
            case "D":
                System.out.println("D :  YOUR PERCENTAGE BETWEEN 45% TO 50%");
            default:
                System.out.println("Please provide valid GRADE!");
        }
    }
}
