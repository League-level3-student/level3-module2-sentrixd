package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}

	// 0. Since this sorting algorithm uses recursion,
	// we'll make a helper method called mergeSort.
	// Complete the steps in the mergeSort method.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		// 20. call the mergeSort method with 0 and the length of the array minus one
		mergeSort(array, 0, array.length - 1, display);
	}

	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		// 1. Create a temporary integer array that is the same length as the passed in
		// array.
		int[] tempArr = new int[array.length];
		// 2. make an if statement that checks if low is less than high
		// and put the rest of the method inside of it
		if (low < high) {
			int middle = low + (high - low) / 2;
			
			mergeSort(array, low, middle, display);
			mergeSort(array, middle + 1, high, display);
			
			int i;
			
			for (i = low; i <= high; i++)
				tempArr[i] = array[i];
			
			i = low;
			
			int j = middle + 1;
			int k = low;
			
			while (i <= middle && j <= high) {
				if (tempArr[i] <= tempArr[j]) {
					array[k] = tempArr[i];
					i++;
				} else {
					array[k] = tempArr[j];
					j++;
				}
				k++;
				display.updateDisplay();
			}
			
			while (i <= middle) {
				array[k] = tempArr[i];
				k++;
				i++;
				display.updateDisplay();
			}
		}
	}
}