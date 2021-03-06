package search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Divyaprakash
 *
 */
class TestSearch {
	@Test
	public void testLinear() {
		int[][] input = { { 2, 4, 6, 78, 9 }, { 1, 2, 3, 4, 5, 6 },
				        { 2, 4, 6, 0, 6, 8, 8, 9 }, { -1, 37, 4, 2, 3 } };
		int[] element = { 0, 1, 8, 3 };
		int[] output = { -1, 0, 5, 4 };
		for (int i = 0; i < input.length; i++) {
			Search s = new Search();
			assertEquals(output[i], s.linearSearch(input[i], element[i]));
		}
	}

	@Test
	void test() {
		int[][] input = { { 2, 4, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6 },
						  { 2, 4, 6, 6, 8, 8, 9 }, { -1, 20, 32 } };
		int[] element = { 0, 1, 8, 3 };
		int[] output = { -1, 0, 4, -1 };
		for (int i = 0; i < input.length; i++) {
			Search s = new Search();
			assertEquals(output[i], s.binarySearch(input[i], element[i]));
		}
	}

}
