import java.util.Scanner;

public class pascalTriangle {
    public static int[][] pascal(int n) {

        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++) {

            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return arr;
    }

    public static void printPascalTriangle(int arr[][], int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < arr[i].length; j++) { // BIG BRAIN MOMENT BY ME AS I DETERMINE THE LENGTH OF J
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth of pascal triangle to be print");
        int n = sc.nextInt();
        int pasTri[][] = pascal(n);
        printPascalTriangle(pasTri, n);
    }
}