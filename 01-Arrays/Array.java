import java.util.*;

public class Array {
    public static void main(String[] args) {
        // Array with initial value (size determined automatically)
        int[] arr1 = {4,8,9,1,0};

        // Empty arry with size = 5. Initially all value are 0.
        int[] arr2 = new int[5];

        // Get 
        System.out.println(arr1[0]);

        // Set
        arr1[0] = 30;
        System.out.println(arr1[0]);

        // Length
        System.out.println(arr1.length);

        // Traverse
        for (int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
