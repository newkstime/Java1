
public class House {

		private int bedrooms;
		private double familyRoomSizeSqft;
		private double livingRoomSizeSqft;
		private String houseStyle;
		private double acreage;
		
		public House() {}
		
		public House(String style, double familyRoomArea, double livingRoomArea, 
				int numberOfBedrooms, double plotSize) {
			bedrooms = numberOfBedrooms;
			familyRoomSizeSqft = familyRoomArea;
			livingRoomSizeSqft = livingRoomArea;
			houseStyle = style;
			acreage = plotSize;			
		}
		
		public int getBedrooms() {
			return bedrooms;
		}
		
		public void setBedrooms(int numberOfBedrooms) {
			bedrooms = numberOfBedrooms;
		}
		
		public double getFamilyRoomArea() {
			return familyRoomSizeSqft;
		}
		
		public void setFamilyRoomArea(double familyRoomArea) {
			familyRoomSizeSqft = familyRoomArea;
		}
		
		public double getLivingRoomArea() {
			return livingRoomSizeSqft;
		}
		
		public void setLivingRoomArea(double livingRoomArea) {
			livingRoomSizeSqft = livingRoomArea;
		}
		
		public double getPlot() {
			return acreage;
		}
		
		public void setPlot(int plotSize) {
			acreage = plotSize;
		}
		
		public String getStyle() {
			return houseStyle;
		}
		
		public void setStyle(String style) {
			houseStyle = style;
		}
		
		public double getTotalArea() {
			return (300 * bedrooms) + familyRoomSizeSqft + livingRoomSizeSqft;
		}
		
		public int compareArea(House otherHouse) {
			double difference = getTotalArea() - otherHouse.getTotalArea();
			if (difference > 0) {
				return 1;
			} else if (difference < 0) {
				return -1;
			} else {
				return 0;
			}
		}
		
		public String toString() {
			return "House style = " + houseStyle + " Bedrooms = " + bedrooms +
					" Family Room Area = " + familyRoomSizeSqft + " Living Room Area = " +
					" Plot = " + acreage + " Total square feet = " + getTotalArea();
		}
		
}
