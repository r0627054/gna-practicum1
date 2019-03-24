package gna;

/**
 * Performs sort by using the Insertion Sort algorithm.
 * 
 */
public class InsertionSort extends SortingAlgorithm {
	
	/**
	 * Constructor.
	 */
	public InsertionSort() {
	}
	
	/**
	 * Sorts the given array using insertion sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		this.resetNumberOfComparisons();
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = i;    j > 0 && this.less(array[j],array[j-1])  ; j--) {
				this.exchange(array, j, j-1);
			}
		}
		return this.getNumberOfComparisons();
	}


}
