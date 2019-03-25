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
		//SortingAlgorithm[] algorithms = {new InsertionSort(), new SelectionSort(), new QuickSort()};
		//generateDataCSV(algorithms, 100, 16);
		
		SortingAlgorithm[] algorithms = {new InsertionSort(), new QuickSort()};
		doublingRatioDataToCSV(algorithms, 6, 250);
		//System.out.println("done");
	}
	
	
	
	/**
	 * Calculates the time the machine needed in milliseconds to sort the array with the given algorithm.
	 * @param algorithm
	 *        The algorithm that needs to be used to sort the array.
	 * @param array
	 *        The array which will be sorted.
	 * @return The time in milliseconds to sort the array with the given algorithm.
	 */
	private static long timeTrial(SortingAlgorithm algorithm, Comparable[] array) {
		Stopwatch timer = new Stopwatch();
		algorithm.sort(array);
		return timer.elapsedTime();
	}
	
	/**
	 * Executes a doubling ratio experiment with the given algorithms and saves it to a csv file.
	 * @param algorithms
	 *        The algorithms which will execute a doubling ratio experiment.
	 * @param doublings
	 *        The amount of time it should double the array size.
	 * @param startArraySize
	 *        The start size the first array will have.
	 */
	private static void doublingRatioDataToCSV(SortingAlgorithm[] algorithms, int doublings, int startArraySize) {
		String filename=System.getProperty("user.dir") + File.separator + "doublingRatio.csv";
		try (FileOutputStream fos = new FileOutputStream(filename)) {
			for(SortingAlgorithm algorithm: algorithms) {
				String algorithmLine = algorithm.getClass().getSimpleName() + "\n";
				fos.write(algorithmLine.getBytes());
				int currentArraySize = startArraySize;
				for (int i = 0; i <= doublings; i++) {
					long time = timeTrial(algorithm, randomDoubleArray(currentArraySize));
					System.out.println(time);
					String dataLine = Integer.toString(currentArraySize) + "," + Long.toString(time) +"\n";
					fos.write(dataLine.getBytes());
					currentArraySize = currentArraySize*2;
				}
			}
		}catch (Exception e) {
			throw new IllegalArgumentException("Couldn't save the content");
		}
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
