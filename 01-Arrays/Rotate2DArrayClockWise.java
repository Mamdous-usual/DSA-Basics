public class Rotate2DArrayClockWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        rotateClockWise(arr);
    }


        public static void rotateClockWise(int[][] arr) {

            // Transpose 
            // Lower triangle of the matrix -> swap ((i,j) -> (j,i))
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            
            // Reverse
            for (int i = 0; i < arr.length; i++) {
                int a = 0;
                int b = arr.length - 1;

                while (a < b) {
                    int swap = arr[i][b];
                    arr[i][b] = arr[i][a];
                    arr[i][a] = swap;

                    a++;
                    b--;
                }
            }

            // Traverse
            for (int i = 0; i<arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                   System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
}
