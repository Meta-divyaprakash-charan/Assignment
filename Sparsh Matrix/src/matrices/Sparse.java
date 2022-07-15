package matrices;

/***
 * This class can use to perform different operations on sparse matrices
 * @author Divyaprakash
 */
public final class Sparse{
	private final int matrix[][];

	/**
	 * @param matrix
	 */
	public Sparse(int[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * getter method to return matrix
	 * 
	 * @return matrix of current object is returned
	 */
	public int[][] getSparseMatrix() {
		return matrix;
	}

	/**
	 * transpose() method finds the transpose of a matrix
	 * 
	 * @return resultant matrix
	 */
	public int[][] transpose() {

		int[][] transpose_matrix = new int[this.matrix.length][this.matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			transpose_matrix[i][0] = matrix[i][1];
			transpose_matrix[i][1] = matrix[i][0];
			transpose_matrix[i][2] = matrix[i][2];
		}
		return transpose_matrix;
	}
	// time complexity = O(n) , n=number of non zero in matrix

	/**
	 * isSymmetrical() method checks whether matrix is symmetric or not
	 * 
	 * @return boolean
	 */
	public boolean isSymmetrical() {
		int size = matrix.length;
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			flag = false;
			int row = matrix[i][0];
			int col = matrix[i][1];
			int val = matrix[i][2];
			/* checking with all elements in matrix  */
			for (int j = 0; j < size && col >= matrix[j][0]; j++) {
				if (matrix[j][0] == col && matrix[j][1] == row && matrix[j][2] == val) {
					flag = true;
					break;
				}
			}
			// if mat1[i][j] not equal to mat2[j][i] return false and exit
			if (!flag) {
				break;
			}
		}
		return flag;
	}
	// time complexity = O(n*n) , n=number of non zero in matrix

	/**
	 * add two SparseMatrix
	 * 
	 * @param m1, 1st matrix
	 * @param m2, 2nd matrix
	 * @return return resultant sparse matrix
	 */
	public static int[][] addMatrix(Sparse m1, Sparse m2) {
		int length1 = m1.matrix.length;
		int length2 = m2.matrix.length;
		int[][] result = new int[length1 + length2][3];
		
		int i = 0;  // i for 1st matrix traversal
		int j = 0;	// j for 2nd matrix traversal
		int k = 0;  // k for result matrix traversal
						
		while (i < length1 && j < length2) {
				// if rows are same
			if (m1.matrix[i][0] == m2.matrix[j][0]) {
				// if column are same
				if (m1.matrix[i][1] == m2.matrix[j][1]) {
					// add both value and store row, col and value
					result[k][0] = m1.matrix[i][0];
					result[k][1] = m1.matrix[i][1];
					result[k][2] = m1.matrix[i][2] + m2.matrix[j][2];
					i++;
					j++;
					k++;
				}
				// if column are not same
				else {
					// add element of lowest column first
					if (m1.matrix[i][1] < m2.matrix[j][1]) {
						result[k][0] = m1.matrix[i][0];
						result[k][1] = m1.matrix[i][1];
						result[k][2] = m1.matrix[i][2];
						i++;
						k++;
					} else {
						if (m1.matrix[i][1] > m2.matrix[j][1]) {
							result[k][0] = m2.matrix[j][0];
							result[k][1] = m2.matrix[j][1];
							result[k][2] = m2.matrix[j][2];
							j++;
							k++;
						}
					}

				}
			}
			// if rows are not same
			else {
				// add element of lowest rows first
				if (m1.matrix[i][0] > m2.matrix[j][0]) {
					result[k][0] = m2.matrix[j][0];
					result[k][1] = m2.matrix[j][1];
					result[k][2] = m2.matrix[j][2];
					j++;
					k++;
				} else {
					if (m1.matrix[i][0] < m2.matrix[j][0]) {
						result[k][0] = m1.matrix[i][0];
						result[k][1] = m1.matrix[i][1];
						result[k][2] = m1.matrix[i][2];
						i++;
						k++;
					}
				}
			}
		}
		// add remaining elements to result
		while (j < length2) {
			result[k][0] = m2.matrix[j][0];
			result[k][1] = m2.matrix[j][1];
			result[k][2] = m2.matrix[j][2];
			j++;
			k++;
		}
		while (i < length1) {
			result[k][0] = m1.matrix[i][0];
			result[k][1] = m1.matrix[i][1];
			result[k][2] = m1.matrix[i][2];
			i++;
			k++;
		}
		// create copy of result with exact size k
		int[][] copy = new int[k][3];
		for (int x = 0; x < k; x++) {
			copy[x][0] = result[x][0];
			copy[x][1] = result[x][1];
			copy[x][2] = result[x][2];
		}
		return copy;
	}
	// time complexity = O(n) , n=number of non zero element in largest matrix

	/**
	 * multiply() to multiply two matrices
	 * 
	 * @param m1 input matrix1
	 * @param m2 input matrix2
	 * @return return resultant sparse matrix
	 */
	public static int[][] multiplyMatrix(Sparse m1, Sparse m2) {
		int length1 = m1.matrix.length;
		int length2 = m2.matrix.length;
		// assume result matrix has 100 non-zero elements
		int[][] result = new int[100][3];
		int k = 0;
		// i for 1st matrix traversal
		// j for 2nd matrix traversal
		// k for result matrix traversal
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++) {
				// if column of 1st matrix equal to rows of 2nd matrix
				if (m1.matrix[i][1] == m2.matrix[j][0]) {
					// add row, column and value to result
					// result[i][j] = a[i][k] * b[k][j]
					result[k][0] = m1.matrix[i][0];
					result[k][1] = m2.matrix[j][1];
					result[k][2] += (m1.matrix[i][2] * m2.matrix[j][2]);
					k++;
				} else if (m1.matrix[i][1] < m2.matrix[j][0]) {
					break;
				}
			}
		}
		// create copy of result with exact size k
		int[][] copy = new int[k][3];
		for (int x = 0; x < k; x++) {
			copy[x][0] = result[x][0];
			copy[x][1] = result[x][1];
			copy[x][2] = result[x][2];
		}
		return copy;
	}
	// time complexity = O(n1 * n2) , n1=number of non zero element in mat1
	// n2=number of non zero element in mat
}