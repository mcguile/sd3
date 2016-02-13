package SD3Labs;

public class Hanoi {

	/*
	 * Part4: Tower of Hanoi
	 */
	public static void moveOneRing(String from,String to){
		System.out.println("Ring moved from " + from + " to " + to);
	}	
	
	public static void movePile(int n,String from,String to,String via){
			if (n==1) {
				moveOneRing(from, to);
			} else {
				movePile(n-1, from, via, to);
				moveOneRing(from, to);
				movePile(n-1, via, to, from);
			}
	}	
	
	public static void main(String[] args){
		// B is the target, C is auxiliary
		movePile(3,"A","B","C");
	}

}
