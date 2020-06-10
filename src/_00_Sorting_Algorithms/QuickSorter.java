package _00_Sorting_Algorithms;

public class QuickSorter extends Sorter {
	public QuickSorter() {
		type = "Quick";
	}

	// 1. Since this sorting algorithm uses recursion,
	// we'll make a helper method called quickSort.
	// Complete the steps in the quickSort method.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		// 10. call the quickSort method with 0 and the length of the array minus one
		quickSort(array, 0, array.length - 1, display);
	}

	private void quickSort(int[] array, int low, int high, SortingVisualizer display) {
		// 2. create two integer variables called i and j and set them equal
		// to low and high respectively.
		int i = low;
		int j = high;
		int temp = 0;

		int pivot = array[low + (high - low) / 2];

		while (i <= j) {
			while (array[i] < pivot)
				i++;
			
			while (array[j] > pivot)
				j--;
			
			if (i <= j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
			
			display.updateDisplay();
		}
		
		if (low < j) {
			quickSort(array, low, j, display);
			display.updateDisplay();
		}
		
		if (i < high) {
			quickSort(array, i, high, display);
			display.updateDisplay();
		}
	}

}
