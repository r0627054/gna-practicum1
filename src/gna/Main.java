package gna;

import java.io.File;
import java.io.FileOutputStream;


public class Main {
	/**
	 * Example main function.
	 * 
	 * You can replace this.
	 */
	public static void main(String[] args) {
		SortingAlgorithm[] algorithms = {new InsertionSort(), new SelectionSort(), new QuickSort()};
		generateDataCSV(algorithms, 100, 15);
	}
	
	
	/**
	 * Generates a CSV file with the calculated data.
	 * For each algorithm random arrays are created up to the given sizeLimit.
	 *  (For each size, there are "times" arrays generated and calculated.
	 * The number of compares is calculated and written to an CSV file.
	 * @param algorithms
	 *        The list of algorithms that will be used.
	 * @param sizeLimit
	 *        Up to this limit array will be generated.
	 * @param times
	 *        For each size of an array there are "times" arrays.
	 */
	private static void generateDataCSV(SortingAlgorithm[] algorithms, int sizeLimit, int times) {
		String filename=System.getProperty("user.dir") + File.separator + "dataFile.csv";
		try (FileOutputStream fos = new FileOutputStream(filename)) {
			/*fos.write("hello,yes".getBytes());
			fos.write("\n".getBytes());
			fos.write("new,line,bla".getBytes());*/
			for(SortingAlgorithm algorithm: algorithms) {
				String algorithmLine = algorithm.getClass().getSimpleName() + "\n";
				fos.write(algorithmLine.getBytes());
				for (int size = 1; size <= sizeLimit; size++) {
					for (int time = 0; time < times; time++) {
						Comparable[] randomDoubleArray = randomDoubleArray(size);
						long nbrCompares = algorithm.sort(randomDoubleArray);
						String dataLine = size +"," +nbrCompares + "\n";
						fos.write(dataLine.getBytes());
					}
				}
			}
		}catch (Exception e) {
			throw new IllegalArgumentException("Couldn't save the content");
		}
	}
	
	
	/**
	 * Creates a random array filled with doubles.
	 * @param size
	 *        The size of the array.
	 * @return An array filled with random doubles of the given size.
	 */
	private static Comparable[] randomDoubleArray(int size) {
		Double[] array = new Double[size];
		for (int i = 0; i < size; i++) {
			array[i] = Math.random();
		}
		return array;
	}
	
}
