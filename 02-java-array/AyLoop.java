import java.util.Scanner;

public class AyLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count++;
        }
        System.out.println(count);

        //sum of the array
        System.out.println("Sum of Array");
        int sum = 0;
        for(int i = 0; i <= n - 1; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);

        //maximum of array
        System.out.println("Maximum of array");
        int max = arr[0];

        for(int i = 1; i <= n - 1; i++) {
            if(arr[i] > max) {
             max = arr[i];
            }
        }
        System.out.println(max);

    }
}