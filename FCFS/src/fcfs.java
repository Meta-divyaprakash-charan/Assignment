/***
 * This class works on the first come first serve algorithm for processes Take
 * Arrival and Burst time as input in 2D array Calculate completion, Turn Around
 * and Waiting time for all processes *
 * 
 * @author Divyaprakash
 *
 */

public class fcfs {

	/**
	 * -This method returns completion time for each process
	 * 
	 * @param process
	 * @param n
	 * 
	 * @return compTime
	 */
	public int[] completionTime(int[][] process, int n) {
		int pre = 0;
		int[] compTime = new int[n];
		for (int i = 0; i < n; i++) {
			pre += process[i][1];
			compTime[i] = pre;
		}
		return compTime;
	}

	/**
	 * -This function calculate turn around time for each process
	 * 
	 * @param process
	 * @param cT
	 * @param n
	 * @return turnAroundTime
	 */
	int[] turnAroundTime(int[][] process, int[] cT, int n) {
		int[] turnAroundTime = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = cT[i] - process[i][0];
			turnAroundTime[i] = (temp < 0) ? -temp : temp;
		}
		return turnAroundTime;
	}

	/**
	 * Specification -Calculate waiting time for each process
	 * 
	 * @param process
	 * @param taT
	 * @param n
	 * @return
	 */
	int[] waitingTime(int[][] process, int[] taT, int n) {
		int[] waitingTime = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = taT[i] - process[i][1];
			waitingTime[i] = (temp < 0) ? -temp : temp;
		}
		return waitingTime;
	}

	/**
	 * Calculate average waiting time for all process
	 * 
	 * @param wT
	 * @param n
	 * @return
	 */
	float avgWaitingTime(int[] wT, int n) {
		int totalwaitTime = 0;
		for (int i = 0; i < n; i++) {
			totalwaitTime += wT[i];
		}
		float avg = (float) totalwaitTime / (float) n;
		return avg;
	}

	/**
	 * Find maximum waiting time for all process
	 * 
	 * @param wT
	 * @return
	 */
	int maxWaitingTime(int[] wT) {
		int max = 0;
		for (int x : wT) {
			max = (max < x) ? x : max;
		}
		return max;
	}
}
