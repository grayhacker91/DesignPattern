package CompositePattern.Graphic;

public class Circle implements Graphic {
	public void print() {
		//leaf 자신을 그리는 코드
		System.out.println("원");
 	}
}
