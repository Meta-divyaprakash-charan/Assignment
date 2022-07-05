import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.print("Enter number of process : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String sep = "	  |	  ";
		int[][] process = new int[n][2];
		for(int i = 0;i<n;i++){
			for(int j = 0; j<2;j++) {
				process[i][j] = scan.nextInt();
			}}
		
		fcfs f = new fcfs();
		
		int[] compTime=f.completionTime(process, n);
		int[] turnAroundTime=f.turnAroundTime(process, compTime, n);
		int[] waitingTime=f.waitingTime(process, turnAroundTime, n);
		float avg =	f.avgWaitingTime(waitingTime, n);
		int max = f.maxWaitingTime(waitingTime);
		
		System.out.println("Arrival Time | Burst Time | Completion Time | Turn Around Time | Waiting Time |");
		for(int i = 0; i< n;i++){
			System.out.println(process[i][0] +sep+ process[i][1] +sep+ compTime[i] +sep+turnAroundTime[i] + sep + waitingTime[i]);
		}
		System.out.println("Average waiting time : " + avg);
		System.out.println("Maximum waiting time : " + max);
}}
