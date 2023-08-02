public class ArrayOfPalindromeNum {
    public static void main(String[] args) {
        int a[]={121,133,141,155,161,252};
        int i=0;
        int temp=0;
        int reverse=0;
        int rem=0;
        while(i<a.length) {
            rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp=temp/10;
        }
        if(reverse == a[i]){
            System.out.println(a[i] +"  is palindrome no");
        }
        else{
            System.out.println( a[i] + "  is not palindrome no");
        }
    }
    }

