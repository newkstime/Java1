import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Operation {

	public static void main(String[] args) {
		WidgetViewer wv = new WidgetViewer();
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		JLabel firstNum = new JLabel("First number is " + x);
		JLabel secondNum = new JLabel("Second number is " + y);
		JLabel prompt = new JLabel("Enter an operation number.");
		JTextField userInput = new JTextField(5);
		JButton submitButton = new JButton("Click once you have entered your number.");
		wv.add(firstNum);
		wv.add(secondNum);
		wv.add(prompt);
		wv.add(userInput);
		wv.addAndWait(submitButton);

		String userAnswer = userInput.getText();
		int operation = Integer.parseInt(userAnswer);
		String answer = "";
		if (operation >= 1 && operation <= 10) {
			int result = x + y;
			answer = Integer.toString(result);
		} else if (operation % 4 == 0) {
			int result = x - y;
			answer = Integer.toString(result);
		} else if (operation % 5 == 0) {
			int result = x / y;
			answer = Integer.toString(result);
		} else if (operation % 2 == 0) {
			double result = x / (double)y;
			answer = Double.toString(result);
		} else {
			int result = x * y;
			answer = Integer.toString(result);
		}
		
		JLabel response = new JLabel("The result is: " + answer);
		wv.add(response, 22, 175, 300,  20);
	}

}
