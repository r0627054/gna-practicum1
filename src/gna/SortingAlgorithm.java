package gna;

// Do not remove the "implements libpract.SortingAlgorithm".
public abstract class SortingAlgorithm implements libpract.SortingAlgorithm{
	
	/**
	 * Variable storing the number of comparisons the algorithm needs, to sort the array.
	 */
	private long numberOfComparisons = 0L;
	
	/**
	 * Increments the numberOfComparisons variable.
	 * @post The numberOfComparisons variable is incremented with 1.
	 *       | new.getNumberOfComparisons() == numberOfComparisons + 1
	 */
	private void incrementNumberOfComparisons() {
		this.numberOfComparisons++;
	}
	
	/**
	 * Returns the number of comparisons.
	 * @return Returns the number of comparisons.
	 */
	public long getNumberOfComparisons() {
		return this.numberOfComparisons;
	}
	
	/**
	 * The numberOfComparisons variable is reset to zero.
	 * @post The numberOfComparisons variable equals 0.
	 *       | new.getNumberOfComparisons() == 0L
	 */
	protected void resetNumberOfComparisons() {
		this.numberOfComparisons = 0L;
	}
	
	/**
	 * Returns whether Comparable a is less than Comparable b.
	 *  And the numberOfComparisons variable is incremented because this is a compare.
	 * @param a
	 *         The first object (which implements the Comparable interface) of the comparison.
	 * @param b
	 *         The second object (which implements the Comparable interface) of the comparison. 
	 * @return True if a is less than b; otherwise False.
	 *        |  a.compareTo(b) < 0
	 */
	protected boolean less(Comparable a, Comparable b) {
		this.incrementNumberOfComparisons();
		return a.compareTo(b) < 0;
	}
	
	/**
	 * Exchanges the i-th and j-th element in the array. 
	 * @param array
	 *        The array in which the elements are exchanged.
	 * @param i
	 *        The index of the first element which will be exchanged.
	 * @param j
	 *        The index of the second element which will be exchanged.
	 * @post The i-th is exchanged with the j-th element in the array.
	 */
	protected void exchange(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	/**
	 * Sorts the given array.
	 * 
	 * Note: to know whether "array[i] < array[j]", one writes "array[i].compareTo(array[j]) < 0".
	 * 
	 * @throws IllegalArgumentException
	 * 	array == null
	 * @post
	 * 	After execution of this method, array is sorted. That means:
	 *  - any element of the original array has the same amount of occurrences in the new array,
	 *    e.g. if the original array has twice the element x, the resulting element has twice the element x.
	 *  - any elements of the resulting array has the same amount of occurrences in the original array
	 *  - for any elements x and y in the resulting array, x occurs before y if and only if x is
	 *    less than or equal to y, according to the compareTo method.
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	public abstract long sort(Comparable[] array) throws IllegalArgumentException;
	
}
