import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Now enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
       
        // Main Logic
        int i = 0;
        int j = size - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");

        }
        
    }
}
