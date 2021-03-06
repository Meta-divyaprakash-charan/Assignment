public class ArrOperations {
	private int count = 0;

	/*
	 * Specification
	 *
	 * -Return length of maximum mirror in an array
	 * 
	 * @param int[] array
	 * 
	 * @return int count
	 * 
	 * @throws IllegalArgumentException
	 */
	int maxMirror(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("Null array not allowed ");
		}
		for (int i = 0; i < array.length; i++) {
			int k = i;
			for (int x = array.length - 1; x >= 0; x--) {
				int temp = 0;
				int j = x;
				while (j >= 0 && i < array.length && array[i] == array[j]) {
					temp++;
					count = (count >= temp) ? count : temp;
					i++;
					j--;
				}
				i = k;
			}
		}
		return count;
	}

	/*
	 * Specification
	 *
	 * -Calculate number of clumps in an array
	 * 
	 * @param int[] array
	 * 
	 * @return int count
	 * 
	 * @throws IllegalArgumentException
	 */
	int numOfClumps(int[] array) {
		int count = 0;
		boolean clump = true;
		if (array == null) {
			throw new IllegalArgumentException("Null array not allowed ");
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				if (clump) {
					count++;
					clump = false;
				}
			} else
				clump = true;
		}
		return count;
	}

	/*
	 * Specification 
	 * -Calculate number of repetition of a number in an array
	 * 
	 * @param int x
	 * @param int[] a
	 * 
	 * @return int count
	 */
	int count(int x, int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				count++;
		}
		return count;
	}

	/*
	 * Specification 
	 * -Rearrange an array and put Y after X without moving X
	 * 
	 * @param int[] Array
	 * @param int X
	 * @param int Y
	 * 
	 * @result int[] newArray
	 * 
	 * @throws IllegalArgumentException
	 */

	int[] fixXY(int Array[], int X, int Y) {
		int[] empty = {};
		int j = 0;

		if (Array == null || Array == empty) {
			throw new IllegalArgumentException("Empth and null array are not allowed ");
		}

		else if (count(X, Array) != count(Y, Array)) {
			throw new IllegalArgumentException("Unequal numbers of X and Y");
		}

		else if (Array[Array.length - 1] == X) {
			throw new IllegalArgumentException("X at the last index of array");
		}

		for (int i = 0; i < Array.length - 1; i++) {
			if (Array[i] == X && Array[i + 1] != Y) {
				if (Array[i + 1] == X) {
					throw new IllegalArgumentException("Two adjacent element are X");
				}
				while (Array[j] != Y || (j != 0 && Array[j - 1] == X)) {
					j++;
				}
				Array[j] = Array[i + 1];
				Array[i + 1] = Y;
			}
		}
		return Array;
	}

	/*
	 * Specification -Check and find index of an array if possible to split
	 * 
	 * @param int[] array
	 * 
	 * @return int index
	 * 
	 * @throws IllegalArgumentException
	 */

	int split(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("Null array not allowed ");
		}

		int index = -1;
		int sum = 0;
		int i;
		for (i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum % 2 == 0) {
			sum /= 2;
			i = 0;
			while (i < array.length) {
				if (sum == 0) {
					return i;
				}
				sum = sum - array[i];
				i++;
			}
		}
		return index;
	}
}
