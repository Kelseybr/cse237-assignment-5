package mario;

import support.cse131.ArgsProcessor;

public class Mario {

	public static void main(String[] args) {

		//
		// Surprise! This part is done for you.
		// Don't change this and don't ask for any other inputs
		// or testing will fail
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("What size mountain do you want?");
		int pattern = ap.nextInt("What pattern (1, 2, 3, or 4)?");

		if (size < 1)
			throw new IllegalArgumentException("Size must be at least 1");
		if (pattern < 1 || pattern > 4)
			throw new IllegalArgumentException("Invalid pattern, must be 1, 2, 3, or 4.  Mario aborts");

		//
		// Create the mountain by printing to System.out
		//
		
		if(pattern==1) {
			for(int i = 1; i < size+1; ++i) {
				for( int j = size-1; j >= i; --j) {
					System.out.print(" ");
				}
				for(int k = 0; k < i; ++k) {
					System.out.print("#");
				}
				System.out.println();
			}
		}

		if(pattern==2) {
			for(int i = 1; i < size+1; ++i) {
				for( int j = 0; j < i; ++j) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		
		if(pattern==3) {
			for(int i = size; i >= 0; --i) {
				for( int j = size - 1; j >= i; --j) {
					System.out.print(" ");
				}
				for(int k = 0; k < i; ++k) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		
		if(pattern==4) {
			for(int i = size; i >= 0; --i) {
				for(int j = 0; j < i; ++j) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}