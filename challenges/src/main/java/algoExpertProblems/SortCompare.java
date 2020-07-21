package algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import dataStructures.InsertInSortedArray;
import dataStructures.InsertionSort;

public class SortCompare {
    public static void main(String[] args) {
        int tests = 2;
        int runs = 10;
        int size = 6; // 1 -> 100,000
        long[][][] times = new long[tests][size][runs];
        double[][] avgs = new double[tests][size];

        doTestForInputArray(tests, runs, size, times, avgs);
//        doTestForIntInput(tests, runs, size, times, avgs);
    }

	private static void doTestForIntInput(int tests, int runs, int size, long[][][] times, double[][] avgs) {
		InsertInSortedArray insertInsortedArray = new InsertInSortedArray();
		for (int run = 0; run < runs; run++) {
            System.out.printf("Run #%d...%n", run);

            for (int magnitude = 0; magnitude < size; magnitude++) {
                System.out.printf("Magnitude #%d...%n", magnitude);

                int pow = (int) Math.pow(10, magnitude);
        		Random random = new Random();
        		int randomNumInt = random.nextInt(pow);
        		{
        		    long start = System.currentTimeMillis();
        		    insertInsortedArray.insert1(randomNumInt);
        		    times[0][magnitude][run] = System.currentTimeMillis() - start;
        		}

        		{
        		    long start = System.currentTimeMillis();
        		    insertInsortedArray.insert(randomNumInt);
        		    times[1][magnitude][run] = System.currentTimeMillis() - start;
        		}
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < tests; j++) {
                avgs[j][i] = avg(times[j][i]);
            }
        }

        System.out.printf("Insert1 : %s%n", Arrays.toString(avgs[0]));
        System.out.printf(" Insert : %s%n", Arrays.toString(avgs[1]));
	}

	private static void doTestForInputArray(int tests, int runs, int size, long[][][] times, double[][] avgs) {
		InsertionSort insertionSort = new InsertionSort();
		for (int run = 0; run < runs; run++) {
            System.out.printf("Run #%d...%n", run);

            for (int magnitude = 0; magnitude < size; magnitude++) {
                System.out.printf("Magnitude #%d...%n", magnitude);

                int pow = (int) Math.pow(10, magnitude);
				int[] range = range(pow);
				int[] a = shuffleIntArray(range);
				{
				    long start = System.currentTimeMillis();
				    insertionSort.insertionSort(Arrays.copyOf(a, a.length));
				    times[0][magnitude][run] = System.currentTimeMillis() - start;
				}
				
				{
				    long start = System.currentTimeMillis();
				    insertionSort.insertionSort1(Arrays.copyOf(a, a.length));
				    times[1][magnitude][run] = System.currentTimeMillis() - start;
				}
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < tests; j++) {
                avgs[j][i] = avg(times[j][i]);
            }
        }

        System.out.printf(" insertionSort : %s%n", Arrays.toString(avgs[0]));
        System.out.printf("insertionSort1 : %s%n", Arrays.toString(avgs[1]));
	}

	private static double avg(long[] times) {
        long total = 0;
        for (long time : times) total += time;
        return ((double) total) / times.length;
    }

    private static int[] range(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) a[i] = i;
        return a;
    }

    private static int[] shuffleIntArray(int[] a) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = a.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
        }
        return a;
    }
}