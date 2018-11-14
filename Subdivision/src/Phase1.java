import java.util.ArrayList;
import java.util.Scanner;

public class Phase1 {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		Subdivision subdivision = new Subdivision();
		System.out.print("How many houses are being added to the subdivision? ");
		int numOfHouses = kybd.nextInt();
		for (int i = 0; i < numOfHouses; i++) {
			System.out.println("Enter information for House #" + (i + 1));
			System.out.print("House style: ");
			kybd.nextLine();
			String style = kybd.nextLine();
			System.out.print("Number of bedrooms: ");
			int bedrooms = kybd.nextInt();
			System.out.print("Family room area in square feet: ");
			double familyRoomSizeSqft = kybd.nextDouble();
			System.out.print("Living room area in square feet: ");
			double livingRoomSizeSqft = kybd.nextDouble();
			System.out.print("Acreage of the plot: ");
			double acreage = kybd.nextDouble();
			System.out.print("\n");
			House houseToAdd = new House(style, familyRoomSizeSqft, livingRoomSizeSqft, 
					bedrooms, acreage);
			subdivision.add(houseToAdd);
		}
		
		
		System.out.println("The subdivision contains " + subdivision.size() + " houses.");
		System.out.println(subdivision);
		
		System.out.print("What is the maximum area in sqft: ");
		int maxSqft = kybd.nextInt();
		System.out.print("What is the minimum area in sqft: ");
		int minSqft = kybd.nextInt();
		String sqftOutput = subdivision.listByArea(minSqft, maxSqft).toString();
		String[] housesWithArea = sqftOutput.substring(1, sqftOutput.length() - 1).split(",");
		for (String house: housesWithArea) {
			System.out.println(house.trim());
		}
		System.out.print("\n");
		
		System.out.print("What is the maximum number of bedrooms: ");
		int maxBeds = kybd.nextInt();
		System.out.print("What is the minimum number of bedrooms: ");
		int minBeds = kybd.nextInt();
		String bedOutput = subdivision.listByBedrooms(minBeds, maxBeds).toString();
		String[] housesWithBeds = bedOutput.substring(1, bedOutput.length() - 1).split(",");
		for (String house: housesWithBeds) {
			System.out.println(house.trim());
		}
		
		
		System.out.print("\n");
		
		System.out.print("What is the maximum number of acres: ");
		int maxPlot = kybd.nextInt();
		System.out.print("What is the minimum number of acres: ");
		int minPlot = kybd.nextInt();
		String plotOutput = subdivision.listByPlot(minPlot, maxPlot).toString();
		String[] housesWithPlot = plotOutput.substring(1, plotOutput.length() - 1).split(",");
		for (String house: housesWithPlot) {
			System.out.println(house.trim());
		}
		
		
		
		
		System.out.print("\n");
		
		System.out.println("The houses sorted by area: ");
		String sortedAreaOutput = subdivision.sortByArea().toString();
		String[] housesSortedAreaOutput = sortedAreaOutput.substring(1, sortedAreaOutput.length() - 1).split(",");
		for (String house: housesSortedAreaOutput) {
			System.out.println(house.trim());
		}
		
		System.out.print("\n");
		
		System.out.println("The houses sorted by acreage: ");
		String sortedPlotOutput = subdivision.sortByPlot().toString();
		String[] housesSortedPlotOutput = sortedPlotOutput.substring(1, sortedPlotOutput.length() - 1).split(",");
		for (String house: housesSortedPlotOutput) {
			System.out.println(house.trim());
		}
		
		System.out.print("\n");
		
		System.out.println(subdivision);
	}
}
