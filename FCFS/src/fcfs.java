
public class fcfs {
	

public int[] completionTime(int[][] arr, int n){
		int pre = 0;
		int[] compTime=new int[n];
		for(int i=0;i<n;i++){
			pre += arr[i][1];
			compTime[i] = pre;			
			}
		return compTime;
		}
	
int[] turnAroundTime(int[][] process, int[] cT, int n){
	int[] turnAroundTime=new int[n];
	for(int i = 0;i<n;i++) {
		int temp = cT[i] - process[i][0];
		turnAroundTime[i] = (temp<0)?0:temp;
	}
	return turnAroundTime;
	}

int[] waitingTime(int[][] process, int[] taT, int n){
	int[] waitingTime=new int[n];
	for(int i = 0;i<n;i++) {
		int temp = taT[i] - process[i][1];
		waitingTime[i] = (temp<0)?0:temp;
	}	
	return waitingTime;
}

float avgWaitingTime(int [] wT, int n){
	int totalwaitTime = 0;
	for(int i=0;i<n;i++) {
		totalwaitTime += wT[i];
	}
	float avg = (float)totalwaitTime/(float)n;
	return avg;
}

int maxWaitingTime(int [] wT){
	int max = 0;
	for(int i=0;i<wT.length;i++) {
		max = (max<wT[i])?wT[i]:max;
	}
	return max;
	}
}
