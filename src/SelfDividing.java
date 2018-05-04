import java.util.*;

/*
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 */
public class SelfDividing {

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (i % 10 != 0) {
				list.add(i);
			}
		}
//		for(int n : list) {
//			System.out.println(n);
//		}
		for (int j = 0; j < list.size(); j++) {
			int k = list.get(j);
			String s = Integer.toString(k);
			for (int l = 0; l < s.length() - 1; l++) {
				if (k % s.charAt(l) != 0) {
					//System.out.println("S: " + s.charAt(l) + " " + k);
					list.remove(j);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list = SelfDividing.selfDividingNumbers(1, 22);
		for(int n : list) {
			System.out.println(n);
		}
	}
}
