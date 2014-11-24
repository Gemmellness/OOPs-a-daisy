package package7;

public class Question7 {
	public static void main(String[] args){
		//Initialise controller class
		LinkedListController Contr = new LinkedListController();
		
		//Create new list
		Element list1 = Contr.newList(3);
		//Adding elements to list
		Contr.insertAtEnd(list1, 9);
		list1.insertAfter(-1);
		//List is 3, -1, 9		
		
		//Get nth element of list
		int n = 1;
		int v = Contr.getnth(list1, n);
		System.out.println("Nth: " + v);
		
		//Get head element
		Element e = list1.getNext().getHead();
		int w = e.getVal();
		System.out.println("Head value: " + w);
		
		//Remove element
		list1.removeNext();
		int x = Contr.getnth(list1, n);
		System.out.println("New nth: " + x);
		//List is now 3, 9
		
		//Length of list
		int y = Contr.getLength(list1);
		System.out.println("Length: " + y);
		
		//Check if list has a cycle
		System.out.println("Has cycle? " + Contr.hasCycle(list1));
	}
}
