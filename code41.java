class code41 {

    static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        // To store which rows and columns are
        // supposed to mark with zeroes
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // Traverse the matrix to fill rows[] and cols[]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If the cell contains zero then mark
                // its row and column as zero
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set matrix elements to zero if they
        // belong to a marked row or column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Mark cell (i, j) with zero if either
                // of rows[i] or cols[j] is true
                if (rows[i] || cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { 
            { 0, 1, 2, 0 },
            { 3, 4, 0, 2 },
            { 1, 3, 1, 5 }
        };

        setMatrixZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}