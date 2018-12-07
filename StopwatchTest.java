
//9.6 extra credit
public class StopwatchTest {

	public static void main(String[] args){
		StopWatch stopWatch = new StopWatch(System.currentTimeMillis());
		//Start stopWatch
		stopWatch.start();
		System.out.println("Start time: " + stopWatch.getStartTime());
	// 100,000 random numbers array
		int[] numbers = new int[100000];
		for(int i = 0; i<numbers.length; i++){
			numbers[i] = (int) (Math.random()*(100000 - 1) + 1);
		}
	//sorting
		for(int i = 0; i<numbers.length; i++){
			for(int j = i+1; j<numbers.length; j++){
				if(numbers[i] >= numbers[j] ){
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
	//stopWatch
		stopWatch.stop();
		System.out.println("Stop time: " + stopWatch.getEndTime());
		System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
	}
}

class StopWatch{
	private long startTime;
	private long endTime;
	
	public StopWatch(long startTime){
		// initiate current Time
		startTime = System.currentTimeMillis();
	}
	public long start(){
		// resets the startTime to the current time
		startTime = System.currentTimeMillis();
		return startTime;
	}
	public long stop(){
		// sets the endTime to the current time
		endTime = System.currentTimeMillis();
		return endTime;
	}
	public long getElapsedTime(){
		//returns the elapsed time for the stopwatch in milliseconds
		return endTime - startTime;
	}
	
	public long getStartTime(){
		return startTime;
	}
	public long getEndTime(){
		return endTime;
	}	
}
