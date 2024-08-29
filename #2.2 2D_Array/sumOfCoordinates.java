import java.util.*;

public class sumOfCoordinates {
    public static void prefixMatrixRowWise(int preMatrix[][],int a,int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 1; j < b; j++) {
                preMatrix[i][j] = preMatrix[i][j] + preMatrix[i][j-1];
            }
        }
    }
    public static void prefixMatrix_Row_ColoumnWise(int preMatrix[][],int a,int b) {
        prefixMatrixRowWise(preMatrix, a, b);
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < b; j++) {
                preMatrix[i][j] = preMatrix[i][j] + preMatrix[i-1][j];
            }
        }
    }
    public static void inputMatrix(int matrix[][], int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int matrix[][], int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int coordinateSumForQuries(int matrix[][],int a,int b,int r1,int r2,int c1,int c2){
        int sum=0;
        prefixMatrix_Row_ColoumnWise(matrix, a, b);
        int upperSum=matrix[r1-1][c2];
        int leftSum=matrix[r2][c1-1];
        int commonPiece=matrix[r1-1][c1-1];
        sum=matrix[a][b]-(upperSum+leftSum)+commonPiece;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matrix[][] = new int[a][b];
        inputMatrix(matrix, a, b);
        System.out.println("the prefixed matrix is");
        prefixMatrix_Row_ColoumnWise(matrix,a,b);
        printMatrix(matrix, a, b);
        System.out.println("Enter the value of row1 and row2");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Enter the value of coloumn1 and coloumn2");
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println(coordinateSumForQuries(matrix, a, b, r1, r2, c1, c2));
        //corner cases are left to be solved
    }
}