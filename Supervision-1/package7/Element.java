package package7;

public class Element {
	private Element next = null;
	private Element head;
	private int x;

	//Constructor
	//When creating new list, set isHead to true (then head is ignored)
	Element(int x, boolean isHead, Element head, Element next){
		this.x = x;
		this.next = next;
		
		if(isHead)
			this.head = this;
		else
			this.head = head;
	}
	//Sets x
	public void setVal (int x){
		this.x = x;
	}
	
	public int getVal (){
		return x;
	}
	
	public Element getNext(){
		return next;
	}
	
	public void setNext(Element next){
		this.next = next;
	}
	
	public void removeNext(){
		if(next != null)
			next = next.getNext();
	}
	
	public Element getHead(){
		return head;
	}
	
	public void insertAfter(int x){
		next = new Element(x, false, head, next);
	}
	
}
