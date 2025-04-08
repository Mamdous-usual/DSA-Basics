public class TwoDimensional {
    public static void main(String[] args) {
        // Initialisation
        int[][] arr = new int[5][6];

        // Set
        arr[1][3] = 10;

        // Get
        System.out.println(arr[1][3]);

        // Rows 
        System.out.println(arr.length);

        // Column
        System.out.println(arr[0].length);
        
        // Traversal
        for (int i = 0; i < arr.length; i++) { // i -> Row

            for (int j = 0; j < arr[0].length; j++) { // j -> Col
                // Code Processing
            }
        }
    }
}
