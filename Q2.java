import java.util.*;
//Q1: TO REVERSE AN ARRAY
public class Q2 {
    static int toreverse(int arr[],int start,int end){
        //c1
        if (arr == null || arr.length == 0) return 0;
        //c2
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return -1;
    }
    static void toprint(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toprint(arr);

        System.out.println("\nReverse Array :");
        toreverse(arr,0,n-1);
        toprint(arr);
    }
}
