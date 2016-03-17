import java.util.Comparator;
import java.util.function.BiPredicate;

public class AdvancedJava {

	private GenericSort<String> gs = new GenericSort<String>();
	private GenericSort<Integer> gi = new GenericSort<Integer>();
	
	// Part 5
	public void task5(){
		String[] strs = {"D","E","X","A"};
		Integer[] ints = {4,5,6,1,12,23};
		
		/*
		 * Part 5: sort both strs and ints using gs and gi respectively
		 *   You should use an anonymous instantce of the Comparator as illustrated in the lecture
		 */
		
		gs.insertionSort(strs, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		gi.insertionSort(ints, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		printIntArray(ints);
		printStringArray(strs);
	}
	
	// Part 6
	public void task6(){
		String[] strs = {"D","E","X","A"};
		Integer[] ints = {4,5,6,1,12,23};
				
		/*
		 * Part 5: sort both strs and ints using gs and gi respectively
		 *   You should use lambda expressions as illustrated in the lecture
		 */		

		BiPredicate<String,String> biStr = (t,u) -> t.compareTo(u)<0;
		gs.insertionSort(strs, biStr);
		
		BiPredicate<Integer,Integer> biInt = (t,u) -> t<u;
		gi.insertionSort(ints, biInt);
		
		printIntArray(ints);
		printStringArray(strs);		
	}
	
	
	private static void printIntArray(Integer[] arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}
	private static void printStringArray(String[] arr){
		System.out.print("[ ");
		for(String i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	
	public static void main(String[] args){
		AdvancedJava adv = new AdvancedJava();
		adv.task5();
		adv.task6();
	}

}
