package package10;

import java.util.ArrayList;

public class Stack <Obj> {
	ArrayList<Obj> stackList = new ArrayList<Obj>();
	
	public void push(Obj a){
		stackList.add(0, a);
	}
	
	public Obj pop(){
		Obj a = stackList.get(0);
		stackList.remove(0);
		return a;
	}
}
