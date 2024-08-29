import java.util.Scanner;

public class queriesPrefixSum {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int SumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean equalSumPartition(int arr[]){
        int totalSum=SumOfArray(arr) ,pref=0;
        for(int i=0;i<arr.length;i++){
            pref+=arr[i];
            int suff=totalSum-pref;
            if(suff==pref){
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements of array");
      int arr[]=new int[10];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(equalSumPartition(arr));
     }
}