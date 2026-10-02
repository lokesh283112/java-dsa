import java.util.Scanner;
//Linear search
public class AYSearch{
   public static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for(int i = 1; i <= n - 1; i++)
        {
        if(arr[i] == target){
            return i;
          }
        }
    return -1;

}

// binary search
public static int binarySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
     
     for(int i = 0; i<= n-1; i++){
        arr[i] = sc.nextInt();
     }

    int result = linearSearch(arr, 5);
    System.out.println(result);
    int result1 = binarySearch(arr, 8);
    System.out.println(result1);
}
}