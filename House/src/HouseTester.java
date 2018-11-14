
public class HouseTester {

	public static void main(String[] args) {
	House house1 = new House("Split-level", 600, 400, 3, .5);
	House house2 = new House("McMansion", 400, 300, 4, 1.5);
	House house3 = new House("Rococo Revival", 601, 400, 3, .5);
	
	System.out.println(house1);
	System.out.println(house2);
	System.out.println(house3);
	System.out.println(house1.compareArea(house2));
	System.out.println(house1.compareArea(house3));
	System.out.println(house2.compareArea(house3));
	
	}
}
