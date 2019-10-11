public class ArrayPrinting {

	public static void printerOfIndex(int[] input, int index) {
		if (index < 0)
			return;
		System.out.println(input[index]);
		printerOfIndex(input, index - 1); // Note that index-- will fail coz..
											// index-- implies index= index -1;
											// so index of this fucntion is also
											// changing

	}

	public static void printArray(int[] input) {
		printerOfIndex(input, input.length - 1);
	}

	public static void main(String[] args) {
		printArray(new int[] { 1, 2, 3, 4, 5 });
	}

}
