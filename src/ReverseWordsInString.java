import java.util.*;
public class ReverseWordsInString {

	
	/*
	 * 	Given a string, you need to reverse the order of characters in each word within a sentence while still
	  	preserving whitespace and initial word order.
		Example 1:
		Input: "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
	 */
	public String reverseWords(String s) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
		ArrayList<String> list2 = new ArrayList<String>();
		String answer = "";
		for(int i=0; i< list.size(); i++) {
			String sk = list.get(i);
			StringBuilder sb = new StringBuilder();
			for(int j=sk.length()-1; j>= 0;  j--) {
				sb.append(j);
			}
			String r = sb.toString();
			list2.add(r);
		}
		for(String p : list2) {
			answer += p + " ";
		}
		return answer;
		
	    }
}
