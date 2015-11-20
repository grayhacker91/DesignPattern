package IteratorPattern.JavaInterfaceUse;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
		ArrayList menu = new ArrayList();
		menu.add(new DinerMenu());
		menu.add(new PancakeHouseMenu());
		menu.add(new CafeMenu());
 
		Waitress waitress = new Waitress(menu);
 
		waitress.printMenu();
	}
}
