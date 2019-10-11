import java.util.HashMap;
import java.util.Map;

public class Fib {

	static Map<Integer, Integer> mp = new HashMap<>();
	static int[] arr;

	public static int fib(int n) {
		arr = (arr == null) ? new int[n] : arr;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (mp.containsKey(n))
			return mp.get(n);

		int result = fib(n - 1) + fib(n - 2);
		mp.put(n, result);

		return result;

	}

	public static void main(String[] args) {
		System.out.println(fib(9));
	}

}
