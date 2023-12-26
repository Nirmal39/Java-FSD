
public class Array {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] nums = {1, 2, 3, 4, 5};
        
        // Print the contents of the array using a for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
        
        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum of the elements in the array: " + sum);
        
        // Find the maximum element in the array
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
}
}
