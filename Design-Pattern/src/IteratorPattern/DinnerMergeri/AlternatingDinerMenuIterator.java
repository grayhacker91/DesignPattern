package IteratorPattern.DinnerMergeri;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] list) {
		this.list = list;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.DAY_OF_WEEK % 2;
	}
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Diner Menu Iterator";
	}
	public void remove(Object o) {
		int rm=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]==o){
				rm=i;
				break;
			}
		}
		for(int i=rm;i<list.length;i++){
			MenuItem temp = list[i];
			list[i]=list[i+1];
			list[i+1]=temp;
		}
		list[list.length]=null;
	}
}
