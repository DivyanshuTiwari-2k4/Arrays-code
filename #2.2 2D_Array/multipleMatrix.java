import java.util.Scanner;

public class multipleMatrix {

    public static void printMatrix(int arr[][],int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixInput(int a,int b){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the element");
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] matrixMultipication(int m,int n,int o,int p){
        int ans[][]=new int [m][p];
        if(n==o){
            System.out.println("Enter the element of first matrix");
            int arr1[][]= matrixInput(m, n);
            System.out.println("Enter the element of second matrix");
            int arr2[][]= matrixInput(o, p);
            int sum=0;
            for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
            for(int k=0;k<n;k++){
            sum=sum+arr1[i][k]+arr2[k][j];
            }
            ans[i][j]=sum;
            sum=0;
            }
        }
        printMatrix(ans, m, p);
        return ans;
        }
        else{
            System.out.println("Matrices cann't be multiplied");
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of first matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        System.out.println("Enter the order of second matrix");
        int o=sc.nextInt();
        int p=sc.nextInt();
        
        matrixMultipication( m, n,o, p);
        
    }
}