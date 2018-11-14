public class SelectionSort {
  /** The method for sorting the numbers */
  public static void selectionSort(double[] list) {
	int comparisons = 0;
	int swaps = 0;
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++, comparisons++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
        swaps++;
      }
    }
    System.out.println("The array length: " + list.length);
    System.out.println("The # of compares: " + comparisons);
    System.out.println("The # of swaps: " + swaps + "\n");
  }
  
  public static void main(String[] args) {
	  final int NUM_ELEMENTS = 4000;
	  double[] lo2hi = new double[NUM_ELEMENTS];
	  double[] hi2lo = new double[NUM_ELEMENTS];
	  double[] random = new double[NUM_ELEMENTS];
	  
	  for (int i = 0; i < lo2hi.length; i++) {
		  lo2hi[i] = i + 1;
	  }
	  
	  for (int i = hi2lo.length, j = 0; i > 0; i--, j++) {
		  hi2lo[j] = i;
	  }
	  
	  for (int i = 0; i < random.length; i++) {
		  random[i] = Math.random();
	  }
	  
	  selectionSort(lo2hi);
	  selectionSort(hi2lo);
	  selectionSort(random);
  }
}
