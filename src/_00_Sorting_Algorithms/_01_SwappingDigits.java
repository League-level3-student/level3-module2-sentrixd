package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		assertEquals(5, findMiddle(m));
	}
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		//int[] newarr = {arr[1], arr[0]};
		
		//System.out.println(newarr[0]);
		//System.out.println(newarr[1]);
		
		//arr = newarr;
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		
		int temp = arr[1];
		
		arr[1] = arr[0];
		arr[0] = temp;
	}
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = 0; x < arr.length - i - 1; x++) {
				if (arr[x] > arr[x + 1]) {
					int arrtemp = arr[x];
					
					arr[x] = arr[x + 1];
					arr[x + 1] = arrtemp;
				}
			}
		}
	}
	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = 0; x < arr.length - i - 1; x++) {
				if (arr[x] > arr[x + 1]) {
					int arrtemp = arr[x];
					
					arr[x] = arr[x + 1];
					arr[x + 1] = arrtemp;
				}
			}
		}
		
		return arr[arr.length/2];
	}
}
