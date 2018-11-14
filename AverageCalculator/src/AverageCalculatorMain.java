
public class AverageCalculatorMain {
	
	public static void main(String[] args) {
	
		AverageCalculator calc1 = new AverageCalculator();
		calc1.add(42);
		System.out.println("The sum: " + calc1.getSum());
		System.out.println("The count: " + calc1.getCount());
		System.out.println("The average: " + calc1.getAverage());
		System.out.println();
		
		AverageCalculator calc2 = new AverageCalculator();
		calc2.add(90);
		calc2.add(89);
		calc2.add(90);
		System.out.println("The sum: " + calc2.getSum());
		System.out.println("The count: " + calc2.getCount());
		System.out.println("The average: " + calc2.getAverage());
	}
}
