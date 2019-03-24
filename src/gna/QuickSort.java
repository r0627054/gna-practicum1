package gna;

/**
 * Performs sort by using the Quick Sort algorithm.
 *
 */
public class QuickSort extends SortingAlgorithm{
	
	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
	
	/**
	 * Sorts the given array using quick sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		this.resetNumberOfComparisons();
		this.sort(array, 0, array.length-1);
		return this.getNumberOfComparisons();
	}

	/**
	 * Sorts the elements between lo-index and hi-index of an array.
	 * @param array
	 *        The array in which the elements will be sorted.
	 * @param lo
	 *        The lowest index of the array in which the elements will be sorted.
	 * @param hi
	 *        The highest index of the array in which the elements will be sorted.
	 */
	private void sort(Comparable[] array, int lo, int hi) {
		if(hi <= lo) return;
		int j = partition(array, lo, hi);
		sort(array, lo, j-1);
		sort(array,j+1,hi);
	}
	
	/**
	 * Partitions the given array based on the pivot.
	 * The pivot is chosen as the first element (lo)
	 *  (Hoare)
	 * @param array
	 *        The array that will be partitioned.
	 * @param lo
	 *        The lowest index of the array that will be partitioned.
	 * @param hi
	 *        The highest index of the array that will be partitioned.
	 * @return The index on which the pivot has reached is final position.
	 */
	private int partition(Comparable[] array, int lo, int hi) {
		int i = lo;
		int j = hi +1;
		Comparable pivot = array[lo];
		while(true) {
			while(this.less(array[++i], pivot)) if(i == hi) break;
			while(this.less(pivot, array[--j])) if(j == lo) break;
			if(i >= j) break;
			this.exchange(array, i, j);
		}
		this.exchange(array, lo, j);
		return j;
	}
	
}
