package question2;

import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {
	private Object[] list;
	
	CollectionArrayList(int length){
		list = new Object[length];
	}
	
	@Override
	public T get(int index) {
		return (T)list[index];
	}
	
	@Override
	public T set(int index, T val){
		T old = (T)list[index];
		list[index] = (Object)val;
		return old;
	}

	@Override
	public int size() {
		return list.length;
	}

}
