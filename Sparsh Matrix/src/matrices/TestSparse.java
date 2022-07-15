/***
 * This is a test class for sparse matrices
 * @author Divyaprakash
 */
package matrices;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestSparse{

	/*Test Case for Transpose */
	@Test
	public void TransposeTestcase1() {
		int matrix[][] = { { 0, 3, 20 }, { 1, 3, 25 }, { 2, 0, 8 }, { 2, 2, 9 }, { 3, 1, 23 } };
		Sparse m = new Sparse(matrix);
		int result[][] = { { 3, 0, 20 }, { 3, 1, 25 }, { 0, 2, 8 }, { 2, 2, 9 }, { 1, 3, 23 } };

		assertArrayEquals(result, m.transpose());
    }

	/*Test cases for Symmetric matrix*/
	@Test
	public void isSymettricTest1() {
		int[][] mat1 = { { 0, 0, 1 }, { 0, 2, 5 }, { 1, 1, 4 }, { 2, 0, 5 }, { 2, 2, 7 } };
		Sparse s1 = new Sparse(mat1);
		assertEquals(true, s1.isSymmetrical());
	}

	public void isSymettricTest2() {
		int[][] mat1 = { { 0, 0, 1 }, { 0, 2, 4 }, { 1, 1, 4 }, { 2, 0, 5 }, { 2, 2, 7 } };
		Sparse s1 = new Sparse(mat1);
		assertEquals(false, s1.isSymmetrical());
	}

	/* Test cases for Add matrices*/
	@Test
	public void addMatrixTest1() {
		int[][] mat1 = { { 0, 1, 10 }, { 0, 3, 12 }, { 2, 2, 5 }, { 3, 0, 15 }, { 3, 1, 12 } };
		int[][] mat2 = { { 0, 2, 8 }, { 1, 3, 23 }, { 2, 2, 9 }, { 3, 0, 20 }, { 3, 1, 25 } };
		Sparse s1 = new Sparse(mat1);
		Sparse s2 = new Sparse(mat2);
		int[][] mat3 = { { 0, 1, 10 }, { 0, 2, 8 }, { 0, 3, 12 }, { 1, 3, 23 }, { 2, 2, 14 }, { 3, 0, 35 },
				{ 3, 1, 37 } };
		assertArrayEquals(mat3, Sparse.addMatrix(s1, s2));
	}

	@Test
	public void addMatrixTest2() {
		int[][] mat1 = { { 0, 1, 10 }, { 1, 1, 12 }, { 2, 2, 5 }, { 3, 1, 12 }, { 3, 3, 7 } };
		int[][] mat2 = { { 0, 1, 10 }, { 0, 2, 8 }, { 1, 0, 2 }, { 2, 2, 9 }, { 3, 0, 20 }, { 3, 3, 2 } };
		Sparse s1 = new Sparse(mat1);
		Sparse s2 = new Sparse(mat2);
		int[][] mat3 = { { 0, 1, 20 }, { 0, 2, 8 }, { 1, 0, 2 }, { 1, 1, 12 }, { 2, 2, 14 }, { 3, 0, 20 }, { 3, 1, 12 },
				{ 3, 3, 9 } };
		assertArrayEquals(mat3, Sparse.addMatrix(s1, s2));
	}

    /* Test cases for multiply matrices */
    @Test
 	public void multiplyMatrixTest1() {
		int[][] mat1 = { { 0, 1, 10 }, { 0, 3, 12 }, { 2, 2, 5 }, { 3, 0, 15 }, { 3, 1, 12 } };
		int[][] mat2 = { { 0, 2, 8 }, { 1, 3, 23 }, { 2, 2, 9 }, { 3, 0, 20 }, { 3, 1, 25 } };
		Sparse s1 = new Sparse(mat1);
		Sparse s2 = new Sparse(mat2);
		int[][] mat3 = { { 0, 3, 230 }, { 0, 0, 240 }, { 0, 1, 300 }, { 2, 2, 45 }, { 3, 2, 120 }, { 3, 3, 276 } };
		assertArrayEquals(mat3, Sparse.multiplyMatrix(s1, s2));
	}

	@Test
	public void multiplyMatrixTest2() {
		int[][] mat1 = { { 0, 1, 10 }, { 2, 2, 5 } };
		int[][] mat2 = { { 0, 2, 8 } };
		Sparse s1 = new Sparse(mat1);
		Sparse s2 = new Sparse(mat2);
		int[][] mat3 = {};

		assertArrayEquals(mat3, Sparse.multiplyMatrix(s1, s2));
	}
}