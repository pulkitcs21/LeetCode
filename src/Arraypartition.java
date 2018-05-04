import java.util.*;

/*
 * 
Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */

public class Arraypartition {
	public int arrayPairSum(int[] nums) {
		int result = 0;
		int length = nums.length;
			Arrays.sort(nums);
			for (int i = 0; i <length;) {
				result += nums[i];
				i += 2;
			}
		return result;
	}
}
