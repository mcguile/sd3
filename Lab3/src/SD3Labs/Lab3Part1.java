package SD3Labs;

public class Lab3Part1 {

	
	//Sum Of Numbers
	public int sumOfNumbers(int n) {
		if (n>0) {
			return n + sumOfNumbers(n-1);
		} else {
			return 0;
		}
	}
	
	
	//Multiplication using addition
	public int multiplyWithAddition(int m, int n) {
		if (m==0 || n==0) {
			return 0;
		}
		if (m==1) {
			return n;
		}
		return multiplyWithAddition(m-1, n) + n;
	}
	
	
	//Fibonacci Number
	public int fibonacci(int n) {
	    if (n==0) {
	        return 0;
	    } else if (n==1) {
	    	return 1;
	    } else {
	    	return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
}
