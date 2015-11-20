package CompositePattern.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
	//Composite object HAS parts (or children).
  	private List<Graphic> children = new ArrayList<Graphic>();

  	//공통 연산: 실제 작업은 각 child에게 위임
  	public void print() {
		for (Graphic child : children) {
			child.print(); 
		}
  	}

  	//child 조작 연산
  	public void add(Graphic child) { 
		children.add(child); 
  	}
  	public void remove(Graphic child) { 
		children.remove(child); 
  	}
}
