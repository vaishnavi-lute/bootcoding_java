public class SumOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,5,7,8,11};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum +"  is sum of given array");
    }
}
