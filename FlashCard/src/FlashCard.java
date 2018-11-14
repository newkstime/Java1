
import java.util.Random;

import javax.swing.*;

public class FlashCard {

	public static void main(String[] args) {
		WidgetViewer wv = new WidgetViewer();
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		String answer = Integer.toString(x * y);
		JLabel question = new JLabel("What is " + x + " times " + y + "?");
		JTextField userInput = new JTextField(5);
		JButton submitButton = new JButton("Click to answer.");
		wv.add(question);
		wv.add(userInput);
		wv.addAndWait(submitButton);
	
		
		String userAnswer = userInput.getText();
		if (userAnswer.equals(answer)) {
			JLabel response = new JLabel("That's correct. Good job.");
			wv.add(response, 22, 175, 300,  20);
		} else {
			JLabel response = new JLabel("Incorrect. The correct answer is: " + (x * y));
			wv.add(response, 22, 175, 300,  20);
		}

	}

}
