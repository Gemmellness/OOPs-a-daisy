package package7;

import java.util.ArrayList;

public class LinkedListController {	
	
	public Element newList(int x){
		Element a = new Element(x, true, null, null);
		return a;
	}
	
	public int getLength(Element e){
		int n = 0;
		
		while(e != null) {
			e = e.getNext();
			n++;
		}
		
		return n;
	}
	
	public void insertAtEnd(Element e, int x){
		while(e.getNext() != null){
			e = e.getNext();
		}
		
		e.insertAfter(x);
	}
	
	//First element has index 0
	public int getnth(Element e, int n){
		for(int i = 0; i < n; i++){
			e = e.getNext();
		}
		return e.getVal();
	}
	
	public boolean hasCycle(Element e){
		boolean hasCycle = false;
		ArrayList<Element> elements = new ArrayList<Element>();
		
		while(e != null){
			for(int i = 0; i < elements.size(); i++){
				if(e == elements.get(i)){
					hasCycle = true;
					break;
				}
			}
			elements.add(e);
			e = e.getNext();
		}
		
		return hasCycle;
	}
}
