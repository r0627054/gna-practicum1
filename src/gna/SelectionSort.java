package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 */
public class SelectionSort extends SortingAlgorithm {
	
	/**
	 * Constructor.
	 */
	public SelectionSort() {
	}
	
	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		this.resetNumberOfComparisons();
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if(this.less(array[j], array[minIndex])) {
					minIndex = j;
				}
			}
			this.exchange(array, i, minIndex);
		}
		return this.getNumberOfComparisons();
	}
}
