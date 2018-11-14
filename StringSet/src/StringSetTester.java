import java.util.Scanner;

public class StringSetTester {

	public static void main(String[] args) {
		 Scanner kybd = new Scanner(System.in);
		 StringSet set = new StringSet();
		 System.out.print("How many strings will you enter? ");
		 int numStr = kybd.nextInt();
		 kybd.nextLine();
		 for (int i = 0; i < numStr; i++) {
			 System.out.print("Enter a string: ");
			 String word = kybd.nextLine();
			 set.add(word);
		 }
		 
		 System.out.println("The set's size: " + set.size());
		 System.out.println("The number of characters in the set: " + set.numChars());
		 System.out.println("The number of words with 5 letters in the set: " + set.countStrings(5));
		 System.out.println("The number of words with 7 letters in the set: " + set.countStrings(7));
	}
}
