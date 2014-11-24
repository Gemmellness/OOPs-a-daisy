package package10;

public class Question10 {
	public static void main(String[] args){
		//Create new stack, type String.
		Stack<String> s1 = new Stack<String>();
		
		//Pushing a few items.
		s1.push("potato");
		s1.push("silicon");
		s1.push("nice");
		s1.push("yes");
		
		//Popping a few items from the stack
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println();
		
		//Multiple stacks
		Stack<String> s2 = new Stack<String>();
		s2.push("type error");
		s2.push("stack overflow");
		System.out.println(s2.pop());
	}
}
