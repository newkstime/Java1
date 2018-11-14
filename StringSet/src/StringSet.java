
public class StringSet {
	
	private String[] strings = new String[10];
	private int stringCount = 0;
	
	public StringSet () {}
	
	public boolean add(String newStr) {
		if (stringCount < strings.length) {
			strings[stringCount] = newStr;
			stringCount++;
			return true;
		} else {
			return false;
		}
	}
		
	public int size() {
		return stringCount;
	}
	
	public int numChars() {
		int numberOfChars = 0;
		for (int i = 0; i < stringCount; i++) {
			numberOfChars += strings[i].length();
		}
		return numberOfChars;
	}
	
	public int countStrings(int len) {
		int numberOfStrings = 0;
		for (int i = 0; i < stringCount; i++) {
			if (strings[i].length() == len) {
				numberOfStrings++;
			}
		}
		return numberOfStrings;
	}
}

