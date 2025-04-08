import java.util.*;

public class Subarrays {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Please enter the size of your array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Now enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Main Logic
        
        System.out.println("Now printing the result");
        for (int si = 0; si < n; si++) {

            for (int ei = si; ei < n; ei++) {

                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}
