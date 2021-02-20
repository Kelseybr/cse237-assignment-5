package imagetransform;

import java.awt.Color;

public class ImageTransforms {
	private static int getRowCount(Color[][] pixelMatrix) {
		return pixelMatrix.length;
	}

	private static int getColCount(Color[][] pixelMatrix) {
		if(pixelMatrix.length>0) {
			return pixelMatrix[0].length;
		} else {
			return 0;
		}
	}

	public static Color[][] copy(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; // TODO: replace null with a new rowCount X colCount matrix (2D array)
		for (int i = 0; i < rowCount; ++i) {
			for (int j = 0; j < colCount; ++j) {
				destination[i][j] = source[i][j];
			}
		}

			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source

			
		return destination;
	}

	public static Color[][] flipHorizontal(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; // TODO: replace null with a new rowCount X colCount matrix (2D array)
		for (int i = 0; i < rowCount; ++i) {
			for (int j = 0; j < colCount; ++j) {
				int hFlip = colCount - 1 - j;
				destination[i][j] = source[i][hFlip];
				
			}
		}

			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source
			// but flipped horizontally

			
		return destination;
	}

	public static Color[][] flipVertical(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; // TODO: replace null with a new rowCount X colCount matrix (2D array)
		
		for (int i = 0; i < rowCount; ++i) {
			for (int j = 0; j < colCount; ++j) {
				int vFlip = rowCount - 1 - i;
				destination[i][j] = source[vFlip][j];
				
			}
		}
			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source
			// but flipped vertically

			
		return destination;
	}

	public static Color[][] mirrorLeftOntoRight(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; // TODO: replace null with a new rowCount X colCount matrix (2D array)
		
		for (int i = 0; i < rowCount; ++i) {
			for (int j = 0; j < colCount/2; ++j) {
				destination[i][j] = source[i][j];	
			}
			for (int k = colCount/2; k< colCount; ++k) {
				destination[i][k] = source[i][colCount-1-k];
			}
		}
			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source
			// but mirror the left pixels onto the right side

			
		return destination;
	}

	public static Color[][] rotateRight(Color[][] source) {
		int srcRowCount = getRowCount(source);
		int srcColCount = getColCount(source);
		int dstRowCount = getColCount(source); // TODO: replace -1 to the correct (rotated) value for destination
		int dstColCount = getRowCount(source); // TODO: replace -1 to the correct (rotated) value for destination
		Color[][] destination = new Color[dstRowCount][dstColCount]; // TODO: replace null with a new dstRowCount X dstColCount matrix (2D array)


		for (int i = 0; i < dstRowCount; ++i) {
			for (int j = 0; j < dstColCount; ++j) {
				destination[i][j] = source[srcRowCount-1-j][i];
			}
		}

			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source
			// but rotate each pixel to the right

			
		return destination;
	}
}
