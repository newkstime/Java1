import java.util.ArrayList;

public class Subdivision {

		private ArrayList<House> houseList = new ArrayList<House>();
		
		public Subdivision() { }
		
		public House get(int position) {
			return houseList.get(position);
		}
		
		public ArrayList<House> list() {
			return houseList;
		}
		
		public ArrayList<House> listByArea(double floor, double ceiling) {
			ArrayList<House> housesWithArea = new ArrayList<House>();
			for (House house: houseList) {
				if (house.getTotalArea() >= floor && house.getTotalArea() <= ceiling) {
					housesWithArea.add(house);
				}
			}
			return housesWithArea;
		}
		
		public ArrayList<House> sortByArea() {
			ArrayList<House> sortedByAreaList = new ArrayList<House>();
			for (House house : houseList) {
				sortedByAreaList.add(house);
			}
		    for (int i = 0; i < sortedByAreaList.size() - 1; i++) {
		        int currentMinIndex = i;

		        for (int j = i + 1; j < sortedByAreaList.size(); j++) {
		          if (sortedByAreaList.get(j).compareArea(sortedByAreaList.get(currentMinIndex)) == -1) {
		            currentMinIndex = j;
		          }
		        }
		        if (currentMinIndex != i) {
		        	House temp = sortedByAreaList.get(currentMinIndex);
		            sortedByAreaList.set(currentMinIndex, sortedByAreaList.get(i));
		            sortedByAreaList.set(i, temp);
		          }
		    }
		    return sortedByAreaList;
		}
		
		public ArrayList<House> listByBedrooms(int floor, int ceiling) {
			ArrayList<House> housesWithBedrooms = new ArrayList<House>();
			for (House house: houseList) {
				if (house.getBedrooms() >= floor && house.getBedrooms() <= ceiling) {
					housesWithBedrooms.add(house);
				}
			}
			return housesWithBedrooms;
		}
		
		public ArrayList<House> listByPlot(int floor, int ceiling) {
			ArrayList<House> housesWithPlot = new ArrayList<House>();
			for (House house: houseList) {
				if (house.getPlot() >= floor && house.getPlot() <= ceiling) {
					housesWithPlot.add(house);
				}
			}
			return housesWithPlot;
		}
		
		public ArrayList<House> sortByPlot() {
			ArrayList<House> sortedByPlotList = new ArrayList<House>();
			for (House house : houseList) {
				sortedByPlotList.add(house);
			}
		    for (int i = 0; i < sortedByPlotList.size() - 1; i++) {
		        double currentMin = sortedByPlotList.get(i).getPlot();
		        int currentMinIndex = i;

		        for (int j = i + 1; j < sortedByPlotList.size(); j++) {
		          if (currentMin > sortedByPlotList.get(j).getPlot()) {
		            currentMin = sortedByPlotList.get(j).getPlot();
		            currentMinIndex = j;
		          }
		        }
		        if (currentMinIndex != i) {
		        	House temp = sortedByPlotList.get(currentMinIndex);
		            sortedByPlotList.set(currentMinIndex, sortedByPlotList.get(i));
		            sortedByPlotList.set(i, temp);
		          }
		    }
		    return sortedByPlotList;
		}
		
		public int size() {
			return houseList.size();
		}
		
		public String toString() {
			String houseString = "";
			int houseNumber = 1;
			for(House house: houseList) {
				houseString += houseNumber + ". " + house.toString() + "\n";
				houseNumber++;
			}
			return houseString;
		}
		
		public boolean add(House houseToAdd) {
			return houseList.add(houseToAdd);
		}
}
