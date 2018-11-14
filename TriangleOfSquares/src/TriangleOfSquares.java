import java.util.Scanner;

public class TriangleOfSquares {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.print("Pick a number from 1 to 9: ");
        int lines = kybd.nextInt(); 
        kybd.close();
        
        for (int row = lines; row > 0; row--) {
            for (int column = lines; column > 0; column--) {
            	/*if ((lines - column + 1) < row) {
            		System.out.print("   ");
        		} else {	
            		System.out.print(String.format("%3d", column * column));
            	}
            	Refactor if statement as ternary */
            	System.out.print((lines - column + 1 < row) ? "   " : String.format("%3d", column * column));
            }
            System.out.println();
        }
	}
}