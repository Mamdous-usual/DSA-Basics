import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of your array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Now enter the elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Main Logic
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("Sum of the array is: %d", sum);

    }
}
