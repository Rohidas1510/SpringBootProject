package rohidas;

public class Assignment4 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

						        int row = 2, column = 3;
						        int[][] matrix = { {1,2}, {4,5},{8,9}};

						        // Display current matrix
						        display(matrix);

						        // Transpose the matrix
						        int[][] transpose = new int[column][row];
						        for(int i = 0; i < row; i++) {
						            for (int j = 0; j < column; j++) {
						                transpose[j][i] = matrix[i][j];
						            }
						        }

						        // Display transposed matrix
						        display(transpose);
						    }

						    public static void display(int[][] matrix) {
						        System.out.println("The matrix is: ");
						        for(int[] row : matrix) {
						            for (int column : row) {
						                System.out.print(column + "    ");
						            }
						            System.out.println();
						        }
						    }

}
