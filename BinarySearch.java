import java.util.Scanner;

public class BinarySearch{
    public static void main(String args[]){
        int i, n;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter Array: ");
        for( i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print("Number to Search For: ");
        i = sc.nextInt();
        BinarySearchUtil(arr, n, i);
     
        sc.close();
    }
    public static void BinarySearchUtil(int[] arr, int n, int key){
        int lo = 0, hi = n-1, mid;
        
        while(lo < hi){
            mid = lo + (hi-lo)/2;
            if(arr[mid]<key)
                lo = mid+1;
            else
                hi = mid;
        }
        
        //Trivial Testing
        if(arr[lo] == key)
            System.out.println("Found: " + arr[lo]);
        else
            System.out.println("Not Found");
    }
}