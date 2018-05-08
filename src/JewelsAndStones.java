import java.util.HashSet;

/*
You're given strings J representing the types of stones that are jewels, 
and S representing the stones you have.  Each character in S is a type of stone you have.  
You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {

	 public static int numJewelsInStones(String J, String S) {
	        int count = 0;
	        HashSet<Character> hs = new HashSet<Character>();
	        for(char c: J.toCharArray()) {
	        		hs.add(c);
	        }
	        for(char c : S.toCharArray()) {
	        		if(hs.contains(c)) {
	        			count++;
	        		}
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		 int k = JewelsAndStones.numJewelsInStones("aAA", "Abbba");
		 System.out.println(k);
	}
}
