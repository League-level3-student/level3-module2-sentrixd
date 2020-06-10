package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length; i++) {
			for (int e = i + 1; e < array.length; e++) {
				if (array[i] > array[e]) {
					int temp = array[i];
					
					array[i] = array[e];
					array[e] = temp;
				}
				
				display.updateDisplay();
			}
		}
	}
	
}	