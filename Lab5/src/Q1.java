public class Q1 {


	/*
	 * 1: complete implementation
	 */
	public static void reverseStack(Stack st){
		Stack temp = new Stack();
		for (int i=0; i<st.size(); i++) {
			temp.push(st.pop());
		}
		st = temp;
	}
	
	
	
	
}
