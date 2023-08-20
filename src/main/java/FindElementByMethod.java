public class FindElementByMethod {
    public static void main(String[] args) {
        int arr[] = {10, 7, 11, 2};
        boolean res = findElement(arr, 7);
        System.out.println(res);
    }

    public static boolean findElement(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return true;
            }
        }
        return false;
    }
}
