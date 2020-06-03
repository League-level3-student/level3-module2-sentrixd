package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] inters) {
		for (int i = 0; i < inters.length - 1; i++) {
			if (inters[i] > inters[i + 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	
	static boolean doubleArraySorted(double[] doubles) {
		for (int i = 0; i < doubles.length - 1; i++) {
			if (doubles[i] > doubles[i + 1]) {
				return false;
			}
		}
		
		return true;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] characters) {
		for (int i = 0; i < characters.length - 1; i++) {
			if (characters[i] > characters[i + 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] strings) {
		for (int i = 0; i < strings.length - 1; i++) {
			if (strings[i].compareTo(strings[i + 1]) >= 0) {
				return false;
			}
			
			//if (strings[i].compareTo(strings[i + 1])) {
				//return false;
			//}
		}
		
		return true;
	}
	
}
