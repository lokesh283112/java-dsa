public class Initialization {

    public static void main(String[] args)
    {
      //method 1
      int[] nums = {10, 9, 30, 40, 50};
      System.out.println(nums.length);
      System.out.print(nums[1] + " ");
      

      //method 2
      int[] arr = new int[5];

      arr[0] = 28;
      arr[1] = 40;
      arr[2] = 30;
      arr[3] = 20;
      arr[4] = 10;

      System.out.println(arr[0]);
      System.out.println(arr.length);
      
    }
}