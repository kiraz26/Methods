package methods;

import java.util.ArrayList;

/**
 * 
 * 
 * Your first method will use String[] and second method will do the same thing
 * using ArrayList<String>
 */
public class Methods {

	/**
	 * 
	 * Write a method switchPairs that switches the order of values in an ArrayList
	 * of Strings in a pairwise fashion. Your method should switch the order of the
	 * first two values, then switch the order of the next two, switch the order of
	 * the next two, and so on.
	 * 
	 * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four",
	 * "seven", "and", "ago", "years"} {"to", "be", "or", "not", "to", "be",
	 * "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
	 * 
	 * Method that is using String[]
	 * 
	 * @param Array
	 * @return switched pairs list
	 */
	public String[] switchPairs(String[] list) {
		// TODO
		for (int i = 0; i < list.length; i+=2) {
			  
		}
		return null;
	}

	/**
	 * 
	 * Method that is using ArrayList<String>
	 * 
	 * @param ArrayList
	 * @return switched pairs list
	 */
	public ArrayList<String> switchPairs(ArrayList<String> list) {

		// TODO
		for (int i = 0; i < list.size(); i++) {
			String word=list.get(i);
			
			
		}
		return null;
	}

	/**
	 * 
	 * @param array
	 *            of book pages
	 * @return page that is out of order; if all pages in the order return -1;
	 * 
	 *         For example you given an array int[]pages={20,100,55,78,44,90}; ->
	 *         method will return 55 int[]pages2={20,21,22,78,44,90};-> method will
	 *         return 44 int[]pages3={20,21,22,78,84,90};-> method will return -1
	 */
	public int outOfOrder(int[] arr) {
		// TODO
		return 0;
	}

	/**
	 * 
	 * @param given
	 *            an ArrayList of integers
	 * @return max int from the ArrayList
	 */
	public int getMax(ArrayList<Integer> myArray) {
		// TODO
		return 0;
	}

	/**
	 * Given an array of integers, return indices of the two numbers,sum of which
	 * will be equal to a specific target number. You may assume that each input
	 * would have exactly one solution, You can not use the same element twice. nums
	 * = [2, 7, 11, 15], target = 9, -> return [0, 1] nums = [5, 2, 4, 6, 3], target
	 * = 6, -> return [1, 2]
	 * 
	 * @param given
	 *            an array of numbers nums
	 * @param target
	 *            is a number sum of which you need to find
	 * @return an array of the indexes for the numbers from an array nums, sum of
	 *         which will be equal to target
	 */
	public int[] twoSum(int[] nums, int target) {
		// TODO
		return null;
	}
}
