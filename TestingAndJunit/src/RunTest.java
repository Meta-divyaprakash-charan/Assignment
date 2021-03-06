/**
 * This file is test class
 * @author Divyaprakash
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunTest {
	ArrOperations a;

	@BeforeEach
	void init() {
		a = new ArrOperations();
	}

	@Test
	void testMaxMirror() {

		assertThrows(IllegalArgumentException.class, () -> a.maxMirror(null));

		int[][] input = { { 7, 1, 4, 9, 7, 4, 1 }, { 1, 2, 3, 8, 9, 3, 2, 1 },
				{ 1, 2, 1, 2, 3, 5, 4, 3, 2, 1, 1, 2, 1 }, { 1, 4, 5, 3, 5, 4, 1 } };
		int[] output = { 2, 3, 4, 7 };

		for (int i = 0; i < output.length; i++)
			assertEquals(output[i], a.maxMirror(input[i]));
	}

	@Test
	void testNumClump() {

		assertThrows(IllegalArgumentException.class, () -> a.numOfClumps(null));

		int[][] input = { { 7, 7, 4, 5, 7, 7, 1 }, { 1, 2, 2, 4, 8, 8, 9, 3 },
				{ 1, 2, 2, 2, 3, 3, 4, 4, 2, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
		int[] output = { 2, 2, 4, 1 };

		for (int i = 0; i < output.length; i++)
			assertEquals(output[i], a.numOfClumps(input[i]));
	}

	@Test
	void testFixXY() {
		int[][] input = { null, { 1, 2, 3, 5, 3, 6, 2, 8, 3, 7 }, { 5, 4, 2, 6, 8, 2, 3, 6, 3 },
				{ 2, 4, 2, 3, 6, 3, 3, 2 } };
		for (int i = 0; i < input.length; i++) {
			int[] array = input[i];
			assertThrows(IllegalArgumentException.class, () -> a.fixXY(array, 3, 2));
		}

		int[][] input2 = { { 1, 4, 1, 5 }, { 5, 4, 9, 4, 9, 5 }, { 1, 4, 1, 5, 5, 4, 1 } };

		int[][] output2 = { { 1, 4, 5, 1 }, { 9, 4, 5, 4, 5, 9 }, { 1, 4, 5, 1, 1, 4, 5 } };

		for (int i = 0; i < input.length - 1; i++) {
			assertArrayEquals(output2[i], a.fixXY(input2[i], 4, 5));
		}
	}

	@Test
	void testSplit() {

		assertThrows(IllegalArgumentException.class, () -> a.split(null));

		int[][] input = { { 1, 1, 1, 2, 1 }, { 2, 1, 1, 2, 1 }, { 10, 10 }, { 1, 4, 5, 3, 1, 2, 5, 4, 1 } };
		int[] output = { 3, -1, 1, 4 };

		for (int i = 0; i < output.length; i++)
			assertEquals(output[i], a.split(input[i]));
	}
}
