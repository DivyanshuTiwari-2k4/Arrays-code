import java.util.Scanner;

public class larggerNum {
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of array");
        int odd = sc.nextInt();
        int arr[] = new int[odd];
        System.out.println("Enter the element of arr of order" + odd);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = createArray();
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max) {
                arr[j] = Integer.MIN_VALUE;
            }
        }

        max = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            if (max < arr[k]) {
                max = arr[k];
            }
        }
        System.out.println(max);
    }
}
