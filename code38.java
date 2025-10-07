import java.util.*;

class code38 {
    // Function to search target in the matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // found
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return false; // not found
    }

    // Main method to test
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        if (searchMatrix(matrix, target)) {
            System.out.println(target + " is present in the matrix.");
        } else {
            System.out.println(target + " is NOT present in the matrix.");
        }

        sc.close();
    }
}


