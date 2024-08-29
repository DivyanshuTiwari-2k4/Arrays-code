import java.util.Scanner;

public class prefixSum {
    public static void swap(int arr[], int a, int b) {// pass by reference
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] prefixSumOf(int arr[]) {
        int ans[] = new int[arr.length];
        int i = 0, j=0;
        while (i < arr.length) {
            if (i == 0) {
                ans[j] = arr[i];
            }
            else{
                ans[j] = arr[i] + ans[j-1];
            }
            i++;
            j++;
        }
        return ans;
    // for(int i=0;i<arr.length;i++){
    //     if(i==0){
    //         arr[i]=arr[i];
    //     }
    //     else{
    //         arr[i]=arr[i]+arr[i-1];
    //     }
    // }
    // printArray(arr);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of arrays");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("done");
        int result[]= prefixSumOf(arr);
        System.out.println("complete");
        printArray(result);
    }
}
