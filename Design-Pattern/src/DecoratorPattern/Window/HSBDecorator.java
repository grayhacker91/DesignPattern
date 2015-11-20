package DecoratorPattern.Window;

public class HSBDecorator extends WindowDecorator{
	public HSBDecorator (Window w) { super(w); }
	  public void draw() { 
		super.draw(); //Delegation
		//추가 기능
	  }
	  public String getDescription() { 
		return super.getDescription() //Delegation
			   + ", including vertical scrollbars"; //추가 기능
	  }
}
