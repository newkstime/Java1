
public class AverageCalculator {
	
	private int sum;
	private int count;
	
	public AverageCalculator() { }
	
	public void add(int newNum) {
		sum += newNum;
		count++;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getCount() {
		return count;
	}
	
	public double getAverage() {
		if (count == 0) return 0;
		else return (double)sum / count;
	}
}
