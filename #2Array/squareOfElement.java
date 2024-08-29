
// import java.util.Scanner;

// public class squareOfElement {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void swap(int arr[], int a, int b) {
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void squareIncreasingOrder(int arr[]) {
//         int i = 0;
//         int j = arr.length - 1;
//         while (i < j) {
//             if (Math.abs(arr[i]) > Math.abs(arr[j])) {
//                 swap(arr, i, j);
//             }
//             arr[i] = arr[i] * arr[i];
//             arr[j] = arr[j] * arr[j];
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the elements of array");
//         int arr[] = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         squareIncreasingOrder(arr);
//         printArray(arr);
//     }
// }
import java.util.Scanner;
public class squareOfElement {
    public static int[] squareIncreasingOrder(int arr[]){
        int i=0, j=arr.length-1, k=0;
        int ans[]=new int[arr.length];
        while (i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                i++;
            }
            else if(Math.abs(arr[i])==Math.abs(arr[j])){}
            else{
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void printArray(){}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ans array");
        int array[]=squareIncreasingOrder(arr);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}