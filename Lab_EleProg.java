import java.util.Scanner;

public class Lab_EleProg {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.print("Enter Labs average in percent: ");
		double labs = kybd.nextDouble();
		System.out.print("Enter REVEL Scores average in percent: ");
		double revel = kybd.nextDouble();
		System.out.print("Enter Midterm average in percent: ");
		double midterm = kybd.nextDouble();
		System.out.print("Enter Project average in percent: ");
		double project = kybd.nextDouble();
		System.out.print("Enter Final average in percent: ");
		double finalPercentage = kybd.nextDouble();
		
		double labWeight = .25;
		double revelWeight = .25;
		double midtermWeight = .20;
		double projectWeight = .15;
		double finalWeight = .15;
		
		double courseAverage = ((labs * labWeight) + 
				(revel * revelWeight) +
				(midterm * midtermWeight) +
				(project * projectWeight) +
				(finalPercentage * finalWeight));
		
		System.out.println("Your average is " +
		courseAverage + "%");
		

	}

}
