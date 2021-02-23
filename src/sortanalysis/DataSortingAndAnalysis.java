package sortanalysis;

import support.cse131.ArgsProcessor;

public class DataSortingAndAnalysis {
	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("What size dataset do you want?");
		
		if (size < 1) {
			size = ap.nextInt("Size of dataset must be at least 1. What size dataset do you want?");
		}
		
		int[] data = new int [size];
		
		for(int i = 0; i < size; ++i) {
			int value = ap.nextInt("What do you want value number " + (i+1) + " to be?");
			data[i] = value;
		}
		System.out.print("Input: ");
		for(int i = 0; i < size; ++i) {
			System.out.print( data[i] + " ");
		}
		System.out.println();

		for(int i = 0; i < size; ++i) {
			int least = i;
			int original = i;
			for(int j = i + 1; j < size; ++j) {
				

					if(data[j] < data[i]) {
						least = j;
						original = data[i];
						data[i] = data[least];
						data[least] = original;
					}
					

			}


////			System.out.println("for run " + i + ": ");
////			for(int k = 0; k < size; ++k) {
////				System.out.print(data[k]);
//			}
			
//			System.out.println(" ");
		}
		System.out.print("Sorted: ");
		for(int i = 0; i < size; ++i) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for(int i = 0; i < size; ++i) {
			sum = sum + data[i];
		}
		double mean = (double)sum / size;
		
		System.out.println("Mean: " + mean);
		 //median
		double median = 0;
		if(size%2==0) {
			//even
			median = (double)(data[size/2 -1] + data[size/2])/ 2;
		}
		else {
			//odd
		    median = data[(size/2) ];
		}
		System.out.println("Median: " + median);	
		System.out.println("Min: " + data[0]);
		System.out.println("Max: " + data[size-1]);
		System.out.println("Range: " + (data[size-1]-data[0]));
	}
}
