import java.util.Scanner;

public class spiralMatrix {
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

    public static void printSprialMatrix(int matrix[][],int m,int n){
        int toprow=0,bottomrow=m-1,leftcolumn=0,rightcolumn=n-1;
        int times=0;
        while (times<(m*n)) {
            //move form leftcoloumn to rightcoloumn
            for(int j=leftcolumn;j<=rightcolumn   && times<(m*n);j++){
                System.out.print(matrix[toprow][j]+" ");
                times++;
            }
            // System.out.println();
            toprow++;
            //move from toprow to bottomrow
            for(int i=toprow;i<=bottomrow  && times<(m*n) ;i++){
                System.out.print(matrix[i][rightcolumn]+" ");
                times++;
            }
            // System.out.println();
            rightcolumn--;
            //move form  rightcoloumn to leftcoloumn
            for(int j=rightcolumn;j>=leftcolumn  && times<(m*n);j--){
                System.out.print(matrix[bottomrow][j]+" ");
                times++;
            }
            // System.out.println();
            bottomrow--;
            //move form bottomrow to toprow
            for(int i=bottomrow;i>=toprow  && times<(m*n);i--){
                System.out.print(matrix[i][leftcolumn]+" ");
                times++;
            }
            // System.out.println();
            leftcolumn++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = matrixInput(m, n);
        printSprialMatrix(matrix, m, n);
    }
}
// public class spiralMatrix {
// public static void printSprialMatrix(int matrix[][],int m,int n){
//     int toprow=0,bottomrow=m-1,leftcoloumn=0,rightcoloumn=n-1;
//     int times=0;
//     while (times<(m*n)) {
//         //left->right
//         for(int i=leftcoloumn;i<=rightcoloumn &&times!=(m*n) ;i++){
//             System.out.print(matrix[toprow][i]+" ");
//             times++;
//         }
//         toprow++;
//         //top->bottom
//         for(int j=toprow;j<=bottomrow &&times!=(m*n);j++){
//             System.out.print(matrix[j][rightcoloumn]+" ");
//             times++;
//         }
//         rightcoloumn--;
//         //right->left
//         for(int k=rightcoloumn;k>=leftcoloumn &&times!=(m*n);k--){
//             System.out.print(matrix[bottomrow][k]+" ");
//             times++;
//         }
//         bottomrow--;
//         //bottom->top
//         for(int l=bottomrow;l>=toprow &&times!=(m*n);l--){
//             System.out.print(matrix[l][rightcoloumn]+" ");
//             times++;
//         }
//         leftcoloumn++;
//     }
// }
// public static int[][] matrixInput(int a, int b) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the element of matrix");
//         int arr[][] = new int[a][b];
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         return arr;
//     }
// public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the order of matrix");
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int matrix[][] = matrixInput(m, n);
//         printSprialMatrix(matrix, m, n);
    
// }
// }