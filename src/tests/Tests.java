package tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import methods.Methods;


public class Tests {
	static Methods method = new Methods();
	String[] array={ "seven", "house", "blue"};
	ArrayList<String> arrayL = new ArrayList<String>();	
	String[] array1={"four", "score", "and", "seven", "years"};
	ArrayList<String> arrayL1 = new ArrayList<String>();
	String[] array2={"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
	ArrayList<String> arrayL2 = new ArrayList<String>();
	String[] array3={"to", "be", "or", "not", "to", "be", "hamlet"};
	ArrayList<String> arrayL3 = new ArrayList<String>();
	String[] array4={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
	ArrayList<String> arrayL4 = new ArrayList<String>();
	String[] array5={"java", "little", "nine", "door", "and", "seven", "yard", "with", "laptop"};
	ArrayList<String> arrayL5 = new ArrayList<String>();
	String[] array6={"tiger", "zebra"};
	ArrayList<String> arrayL6 = new ArrayList<String>();
	String[] array7={"fish"};
	ArrayList<String> arrayL7 = new ArrayList<String>();
		
	@Test
	public void twoSums(){
		int[] nums ={4, 3, 2, 55, 1, 6, 5};
		int target =7;
		int[] expected ={0, 1};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	
	@Test
	public void twoSums2(){
		int[] nums ={3,2,4};
		int target =6;
		int[] expected ={1, 2};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums3(){
		int[] nums ={2, 7, 11, 15};
		int target =9;
		int[] expected ={0, 1};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums4(){
		int[] nums ={2, 3, 8, 7, 11, 15};
		int target =10;
		int[] expected ={0, 2};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums5(){
		int[] nums ={7, 3};
		int target =10;
		int[] expected ={0, 1};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void switchUsingArray(){
		
		String [] expected = {"house", "seven", "blue"};
		assertArrayEquals(expected, method.switchPairs(array));					
		
	}
	@Test
	public void switchUsingArray1(){
		String [] expected2 = {"score", "four", "seven", "and", "years"};
		assertArrayEquals(expected2, method.switchPairs(array1));
	}
	@Test
	public void switchUsingArray2(){
		String [] expected3 = {"is", "this", "of", "lots", "for", "fun", "Java", "every", "programmer"};
		assertArrayEquals(expected3, method.switchPairs(array2));
	}
	@Test
	public void switchUsingArray3(){
		String [] expected4 = {"be", "to", "not", "or", "be", "to", "hamlet"};
		assertArrayEquals(expected4, method.switchPairs(array3));
	}
	@Test
	public void switchUsingArray4(){
		String [] expected5 = {"flowers", "four", "eleven", "sun", "better", "cloud", "git"};
		assertArrayEquals(expected5, method.switchPairs(array4));
	}
	@Test
	public void switchUsingArray5(){
		String [] expected6 = {"little", "java", "door", "nine", "seven", "and", "with", "yard", "laptop"};
		assertArrayEquals(expected6, method.switchPairs(array5));
	}
	@Test
	public void switchUsingArray6(){
		String [] expected7 = {"zebra", "tiger"};
		assertArrayEquals(expected7, method.switchPairs(array6));
	}
	@Test
	public void switchUsingArray7(){
		String [] expected8 = {"fish"};
		assertArrayEquals(expected8, method.switchPairs(array7));
	}
	@Test
	public void switchUsingArrayList(){
		String[] array={ "seven", "house", "blue"};
		for (String string : array) {
			arrayL.add(string);
		}
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("house");
		expected.add("seven");
		expected.add("blue");
		assertArrayListEquals(expected, method.switchPairs(arrayL));	
		
		
	}
	@Test
	public void switchUsingArrayList2(){
		String[] array1={"four", "score", "and", "seven", "years"};
		for (String string : array1) {
			arrayL1.add(string);
		}
		String [] expected2 = {"score", "four", "seven", "and", "years"};
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("score");
		expected.add("four");
		expected.add("seven");
		expected.add("and");
		expected.add("years");
		assertArrayListEquals(expected, method.switchPairs(arrayL1));	
		
		
	}
	@Test
	public void switchUsingArrayList3(){
		String[] array6={"zebra", "tiger"};
		for (String string : array6) {
			arrayL2.add(string);
		}
		String [] expected2 = {"score", "four", "seven", "and", "years"};
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("tiger");
		expected.add("zebra");
		assertArrayListEquals(expected, method.switchPairs(arrayL2));			
		
	}
	@Test
	public void switchUsingArrayList4(){
		String[] array7={"zebra"};
		for (String string : array7) {
			arrayL3.add(string);
		}
		String [] expected2 = {"score", "four", "seven", "and", "years"};
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("zebra");
		assertArrayListEquals(expected, method.switchPairs(arrayL3));	
				
	}

	@Test
	public void getMax(){
		ArrayList<Integer> array = new ArrayList<Integer> ();
		array.add(4);
		array.add(33);
		array.add(1);
		array.add(54);
		array.add(17);		
		assertEquals(54,method.getMax(array));
	}
	@Test
	public void getMax2(){
		ArrayList<Integer> array = new ArrayList<Integer> ();
		array.add(404);
		array.add(33);
		array.add(1);
		array.add(54);
		array.add(17);		
		assertEquals(404,method.getMax(array));
	}
	@Test
	public void getMax3(){
		ArrayList<Integer> array = new ArrayList<Integer> ();
		array.add(17);		
		assertEquals(17,method.getMax(array));
	}
	@Test
	public void outOfOrder(){
		int [] pages={3,66,77,78,79,90,87};		
		assertEquals(87,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder2(){
		int [] pages={3,66,2,78,79,90,87};		
		assertEquals(2,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder3(){
		int [] pages={3,4,7,78,79,90,97};		
		assertEquals(-1,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder4(){
		int [] pages={3,5};		
		assertEquals(-1,method.outOfOrder(pages) );
	}
	private void assertArrayListEquals(ArrayList<String> expected, ArrayList<String> switchPairs) {
		for (int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i),switchPairs.get(i));
		}
		
	}
}
