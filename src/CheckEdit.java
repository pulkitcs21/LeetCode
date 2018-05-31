import java.util.HashMap;
public class CheckEdit {

	/*
	 * There are three types of edits that can be performed on strings: insert a
	 * character, remove a character, or replace a character. Given two strings,
	 * write a function to check if they are one edit (or zero edits) away. EXAMPLE
	 * pale, pIe -> true pales. pale -> true pale. bale -> true pale. bake -> false
	 */
	
	
	// Let's see if we can do better
	public static boolean check(String s, String k) {
		HashMap<Integer, Character> hmap = new HashMap<>();
		
		boolean first = false;
		int count = 0; 
		int difference = 0;
		if(s.length() - 1 > k.length() -1) {
			first = true;
		}
		if(first) {
			char[] c = s.toCharArray();
			for(int i=0; i< c.length; i++) {
				hmap.put(i, c[i]);
			}
			for(int j=0; j<k.length()-1; j++) {
				char ch = k.charAt(j);
				if(hmap.containsValue(ch)) {
					count++;
				}
			}
			difference = (s.length()-1) - count;
			if (difference >= 0 && difference < 2)
				return true;
			else
				return false;
		} else {
			char[] c = k.toCharArray();
			for(int i=0; i< c.length; i++) {
				hmap.put(i, c[i]);
			}
			for(int j=0; j<s.length()-1; j++) {
				char ch = s.charAt(j);
				if(hmap.containsValue(ch)) {
					count++;
				}
			}
			difference = (k.length()-1) - count;
			if (difference >= 0 && difference < 2)
				return true;
			else
				return false;
		}
	}
	
	// Runtime O(n^2)
	public static boolean checkEdit(String s, String k) {
		boolean ans = false;
		int length = s.length() - 1;
		int count = 0;
		int difference = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < k.length() - 1; j++) {
				if (s.charAt(i) == k.charAt(j)) {
					count++;
				}
			}
		}
		difference = length - count;
		if (difference >= 0 && difference < 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		boolean ans = CheckEdit.checkEdit("pale", "pale");
		//System.out.println(ans);
		boolean ans2 = CheckEdit.check("pal", "pale");
		System.out.println(ans2);
	}
}
