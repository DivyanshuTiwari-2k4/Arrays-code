import java.util.Scanner;

public class rotateMatrix {
     public static void printMatrix(int arr[][], int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixInput(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void transpose(int arr[][], int a, int b) {
        // System.out.println("Matrix after transpose");
        for (int i = 0; i < a; i++) {
            for (int j = i; j < b; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

    }

    public static int[][] rotate_90deg(int arr[][],int a,int b) {
        transpose(arr, a, b);
        System.out.println("Matrix after rotation");
        for(int i=0;i<a;i++){
            reverse(arr[i]);
        }
        return arr;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of square matrix to be rotated");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = matrixInput(m,n);
        
        int transMatrix[][] = rotate_90deg(arr1, m, n);
        printMatrix(transMatrix, m, n);
        
    }
}
