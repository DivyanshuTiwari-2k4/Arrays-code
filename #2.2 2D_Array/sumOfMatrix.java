import java.util.Scanner;

public class sumOfMatrix {
    public static void printMatrix(int arr[][], int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixInput(int a, int b) {
        int arr[][] = new int[a][b];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] additionOfMatrices(int arr1[][],int arr2[][], int o, int p) {
        int sumArray[][] = new int[o][p];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of  first matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int array1[][] = matrixInput(m, n);
        System.out.println("Enter the order of second matrix");
        int o = sc.nextInt();
        int p = sc.nextInt();
        int array2[][] = matrixInput(o, p);
        if(m==o && p==n){
            int sumofArray[][] = additionOfMatrices(array1,array2, o, p);
            printMatrix(sumofArray, o, p);
        }
        else{
            System.out.println("Matrices dimension didn't match");
        }
    }
}
