public class SeparateOddEvenArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int n=a.length;
        System.out.println("Even numbers are:");
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
               //System.out.println("Even numbers are:");
                System.out.println(a[i]+" ");
            }
        }
        System.out.println("Odd numbers are:");
        for(int i=0; i<n; i++){
            if(a[i]%2==1){
              //  System.out.println("Odd numbers are:");
                System.out.print(a[i] + " ");
            }
        }
    }
}
