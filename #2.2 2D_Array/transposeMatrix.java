import java.util.Scanner;

public class transposeMatrix {
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

    public static int[][] transposeinplace(int arr[][],int a,int b) {
        System.out.println("Matrix after transpose");
        for (int i = 0; i < a; i++) {
            for (int j = i; j < b; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] transpose(int arr[][], int a, int b) {
        System.out.println("Matrix after transpose");
        int ans[][] = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of square matrix of transpose");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = matrixInput(m,n);
        int transMatrix[][] = transposeinplace(arr1, m, n);
        printMatrix(transMatrix, m, n);
    }
}