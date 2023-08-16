public class ArrayOfSwapping {
    public static void main(String[] args) {
        int a[] = {5, 7, 11, 2, 10, 15};
        int n = a.length;
        System.out.println("print original array  " );
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        System.out.println("Reversed array is: n");
        for (int k=0; k<n; k++){
            System.out.println(a[k]);
        }
    }
    }

