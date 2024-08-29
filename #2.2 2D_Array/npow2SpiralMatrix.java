import java.util.Scanner;

public class npow2SpiralMatrix {
    public static int[][] matrixInput(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix");
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void printMatrix(int arr[][], int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] squareSprialMatrix(int n){
        int matrix[][]=new int[n][n];
        int toprow=0,bottomrow=n-1,leftcolumn=0,rightcolumn=n-1;
        int times=1;
        while (times<=(n*n)) {
            //move form leftcoloumn to rightcoloumn
            for(int j=leftcolumn;j<=rightcolumn   && times<=(n*n);j++){
                matrix[toprow][j]=times;
                times++;
            }
            // System.out.println();
            toprow++;
            //move from toprow to bottomrow
            for(int i=toprow;i<=bottomrow  && times<=(n*n) ;i++){
                matrix[i][rightcolumn]=times;
                times++;
            }
            // System.out.println();
            rightcolumn--;
            //move form  rightcoloumn to leftcoloumn
            for(int j=rightcolumn;j>=leftcolumn  && times<=(n*n);j--){
                matrix[bottomrow][j]=times;
                times++;
            }
            // System.out.println();
            bottomrow--;
            //move form bottomrow to toprow
            for(int i=bottomrow;i>=toprow  && times<=(n*n);i--){
                matrix[i][leftcolumn]=times;
                times++;
            }
            // System.out.println();
            leftcolumn++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        printMatrix(squareSprialMatrix(n), n, n);
    }
}
