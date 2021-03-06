package stack;

public class StackApp {
	
	// Create a shared stack for the methods
	LStack<Integer> stackApp = new LStack<Integer>();
	
	public int fact(int n) {	
		
		while (n != 0) {
			stackApp.push(n);
			n -= 1;
		}
		
		if (n == 0) {
			n += stackApp.pop();
			while (stackApp.isEmpty() != true) {
				n *= stackApp.pop();
			}
		}
		
		return n;
	}
	
	public int sum(int n) {
		
		while (n != 0) {
			stackApp.push(n);
			n -= 1;
		}
		
		while (stackApp.isEmpty() != true) {
			n += stackApp.pop();
		}
		
		return n;
	}
	
	public void reverse(int[] nums) {
		
		for (Integer num: nums) {
			stackApp.push(num);
		}
		
		System.out.print("nums:");
		while (stackApp.isEmpty() != true) {
			System.out.print(" " + stackApp.pop());
		}
	}
}
