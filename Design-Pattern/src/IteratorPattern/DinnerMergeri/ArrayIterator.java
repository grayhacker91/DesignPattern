package IteratorPattern.DinnerMergeri;

public class ArrayIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public ArrayIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public void remove(Object o) {
		int rm=0;
		for(int i=0;i<items.length;i++) {
			if(items[i]==o){
				rm=i;
				break;
			}
		}
		for(int i=rm;i<items.length;i++){
			MenuItem temp = items[i];
			items[i]=items[i+1];
			items[i+1]=temp;
		}
		items[items.length]=null;
	}
}
