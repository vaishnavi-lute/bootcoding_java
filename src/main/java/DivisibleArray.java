public class DivisibleArray {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.println(a[i] + " is divisible of 3");
            } else if (a[i] % 5 == 0) {
                System.out.println(a[i] + " is divisible of 5");
            }
        }
    }
}