package gna;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

import libpract.SortingAlgorithm;

import org.junit.Test;

/**
 * Tests that test whether the implementations of the sorting algorithms do sort.
 */
public class SortingAlgorithmsTest {

	private SortingAlgorithm insertionSort = new InsertionSort();
	private SortingAlgorithm selectionSort = new SelectionSort();
	private SortingAlgorithm quickSort    = new QuickSort();
	
	
	//SELECTION SORT TESTS
	
	@Test
	public void selectionSortWithNormalIntegerArray() {
		Integer[] normalIntegerArray  = {2,5,-3,88,4,70,22,22,54};
		this.selectionSort.sort(normalIntegerArray);
		assertTrue(this.isSorted(normalIntegerArray));
	}
	
	@Test
	public void selectionSortWithSortedIntegerArray() {
		Integer[] sortedIntegerArray  = {3,21,35,88,103,200,504,505,505,600,619};
		this.selectionSort.sort(sortedIntegerArray);
		assertTrue(this.isSorted(sortedIntegerArray));
	}
	
	@Test
	public void selectionSortWithEmptyIntegerArray() {
		Integer[] emptyIntegerArray  = {};
		this.selectionSort.sort(emptyIntegerArray);
		assertTrue(this.isSorted(emptyIntegerArray));
	}
	
	@Test
	public void selectionSortWithSingleIntegerArray() {
		Integer[]singleIntegerArray  = {-35};
		this.selectionSort.sort(singleIntegerArray);
		assertTrue(this.isSorted(singleIntegerArray));
	}
	
	@Test
	public void selectionSortWithNormalStringArray() {
		String[] normalStringArray    = { "A","B", "Z" ,"D", "X" , "K" , "J" ,"L"};
		this.selectionSort.sort(normalStringArray);
		assertTrue(this.isSorted(normalStringArray));
	}
	
	@Test
	public void selectionSortWithSortedStringArray() {
		String[] sortedStringArray    = { "A", "B", "C", "D", "E", "F", "G" ,"H", "I"};
		this.selectionSort.sort(sortedStringArray);
		assertTrue(this.isSorted(sortedStringArray));
	}
	
	@Test
	public void selectionSortWithEmptyStringArray() {
		String[]  emptyStringArray     = {};
		this.selectionSort.sort(emptyStringArray);
		assertTrue(this.isSorted(emptyStringArray));
	}
	
	@Test
	public void selectionSortWithSingleStringArray() {
		String[] singleStringArray   = {"A"};
		this.selectionSort.sort(singleStringArray);
		assertTrue(this.isSorted(singleStringArray));
	}
	
	
	
	//QUICKSORT
	
	@Test
	public void quickSortWithNormalIntegerArray() {
		Integer[] normalIntegerArray  = {2,5,-3,88,4,70,22,22,54};
		this.quickSort.sort(normalIntegerArray);
		assertTrue(this.isSorted(normalIntegerArray));
	}
	
	@Test
	public void quickSortWithSortedIntegerArray() {
		Integer[] sortedIntegerArray  = {3,21,35,88,103,200,504,505,505,600,619};
		this.quickSort.sort(sortedIntegerArray);
		assertTrue(this.isSorted(sortedIntegerArray));
	}
	
	@Test
	public void quickSortWithEmptyIntegerArray() {
		Integer[] emptyIntegerArray  = {};
		this.quickSort.sort(emptyIntegerArray);
		assertTrue(this.isSorted(emptyIntegerArray));
	}
	
	@Test
	public void quickSortWithSingleIntegerArray() {
		Integer[]singleIntegerArray  = {-35};
		this.quickSort.sort(singleIntegerArray);
		assertTrue(this.isSorted(singleIntegerArray));
	}
	
	@Test
	public void quickSortWithNormalStringArray() {
		String[] normalStringArray    = { "A","B", "Z" ,"D", "X" , "K" , "J" ,"L"};
		this.quickSort.sort(normalStringArray);
		assertTrue(this.isSorted(normalStringArray));
	}
	
	@Test
	public void quickSortWithSortedStringArray() {
		String[] sortedStringArray    = { "A", "B", "C", "D", "E", "F", "G" ,"H", "I"};
		this.quickSort.sort(sortedStringArray);
		assertTrue(this.isSorted(sortedStringArray));
	}
	
	@Test
	public void quickSortWithEmptyStringArray() {
		String[]  emptyStringArray     = {};
		this.quickSort.sort(emptyStringArray);
		assertTrue(this.isSorted(emptyStringArray));
	}
	
	@Test
	public void quickSortWithSingleStringArray() {
		String[] singleStringArray   = {"A"};
		this.quickSort.sort(singleStringArray);
		assertTrue(this.isSorted(singleStringArray));
	}
	
	//INSERTION SORT
	
	
	@Test
	public void insertionSortWithNormalIntegerArray() {
		Integer[] normalIntegerArray  = {2,5,-3,88,4,70,22,22,54};
		this.insertionSort.sort(normalIntegerArray);
		assertTrue(this.isSorted(normalIntegerArray));
	}
	
	@Test
	public void insertionSortWithSortedIntegerArray() {
		Integer[] sortedIntegerArray  = {3,21,35,88,103,200,504,505,505,600,619};
		this.insertionSort.sort(sortedIntegerArray);
		assertTrue(this.isSorted(sortedIntegerArray));
	}
	
	@Test
	public void insertionSortWithEmptyIntegerArray() {
		Integer[] emptyIntegerArray  = {};
		this.insertionSort.sort(emptyIntegerArray);
		assertTrue(this.isSorted(emptyIntegerArray));
	}
	
	@Test
	public void insertionSortWithSingleIntegerArray() {
		Integer[]singleIntegerArray  = {-35};
		this.insertionSort.sort(singleIntegerArray);
		assertTrue(this.isSorted(singleIntegerArray));
	}
	
	@Test
	public void insertionSortWithNormalStringArray() {
		String[] normalStringArray    = { "A","B", "Z" ,"D", "X" , "K" , "J" ,"L"};
		this.insertionSort.sort(normalStringArray);
		assertTrue(this.isSorted(normalStringArray));
	}
	
	@Test
	public void insertionSortWithSortedStringArray() {
		String[] sortedStringArray    = { "A", "B", "C", "D", "E", "F", "G" ,"H", "I"};
		this.selectionSort.sort(sortedStringArray);
		assertTrue(this.isSorted(sortedStringArray));
	}
	
	@Test
	public void insertionSortWithEmptyStringArray() {
		String[]  emptyStringArray     = {};
		this.insertionSort.sort(emptyStringArray);
		assertTrue(this.isSorted(emptyStringArray));
	}
	
	@Test
	public void insertionSortWithSingleStringArray() {
		String[] singleStringArray   = {"A"};
		this.insertionSort.sort(singleStringArray);
		assertTrue(this.isSorted(singleStringArray));
	}
	
	
	
	//GENERAL FUNCTIONS:
	
	
	/**
	 * Checks whether a given array is sorted.
	 * @param array
	 *        The array that will be check if it is sorted. 
	 * @return True if the array is sorted otherwise False.
	 */
	private boolean isSorted(Comparable[] array) {
		for (int i = 1; i < array.length; i++) {
			if (this.less(array[i], array[i-1])) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether Comparable a is less than Comparable b.
	 * @param a
	 *         The first object (which implements the Comparable interface) of the comparison.
	 * @param b
	 *         The second object (which implements the Comparable interface) of the comparison. 
	 * @return True if a is less than b; otherwise False.
	 *        |  a.compareTo(b) < 0
	 */
	private boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}
