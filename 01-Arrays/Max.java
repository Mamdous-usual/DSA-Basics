import java.util.*;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Now enter the elements");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Main Logic
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.printf("Maximum value is: %d\n", max);
        
    }
}
