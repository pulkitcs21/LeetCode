import java.util.*;

/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, 
judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. 
The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
The output should be true or false representing whether the robot makes a circle.
 */
public class judgeRoute {
	public static boolean judgeCircle(String moves) {
		int v =0;
		int k =0;
		for(char c: moves.toCharArray()) {
			switch(c) {
			case 'L':
				v++;
				break;
			case 'R':
				v--;
				break;
			case 'U':
				k++;
				break;
			case 'D':
				k--;
				break;
			}
		}
		return v ==0 && k ==0;
	}
	
	public static void main(String[] args) {
		boolean c = judgeRoute.judgeCircle("UDU");
		if(c) {
			System.out.println("Done");
		}else {
			System.out.println("OOPS");
		}
	}

}
