import java.util.Scanner;
public class evenOddMove {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int a,int b){// pass by reference
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void sortEvenOdd(int arr[]){
        int j=0,k=arr.length-1;
        while (j<k){
            if(arr[j]%2!=0 && arr[k]%2==0){
                swap(arr,j,k);
                j++;
                k--;
            }
            if(arr[j]%2==0){
                j++;
            }
            if(arr[k]%2!=0){
                k--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of arrays");
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortEvenOdd(arr);
        System.out.println("Array after sorting ");
        printArray(arr);
    }
}