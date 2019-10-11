public class SpiralPrint {

	public static int[][] sprialArrayGenerator(int n) {

		int rowBegin = 0;
		int rowEnd = n - 1;
		int colBegin = 0;
		int colEnd = n - 1;

		int[][] mat = new int[n][n];
		int val = 1;

		while (rowBegin <= rowEnd && colBegin <= colEnd) {

			// upper row filled
			for (int i = colBegin; i <= colEnd; i++) {
				mat[rowBegin][i] = val++;
			}
			rowBegin++;
			// lefmost column
			for (int i = rowBegin; i <= rowEnd; i++) {
				mat[i][colEnd] = val++;
			}
			colEnd--;

			for (int i = colEnd; i >= colBegin; i--) {
				mat[rowEnd][i] = val++;
			}
			rowEnd--;

			for (int i = rowEnd; i >= rowBegin; i--) {
				mat[i][colBegin] = val++;
			}
			colBegin++;

		}

		return mat;

	}

	public static void print2d(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

		}

	}

	public static void main(String[] args) {
		int n = 5;
		print2d(sprialArrayGenerator(n));
	}
}
