package DecoratorPattern.Window;

public class DecoratorWindowTest {
	public static void main(String[] args) {
        // Create a decorated Window with horizontal and vertical scrollbars
        Window window = new HSBDecorator(new VSBDecorator(new SimpleWindow()));
 
        // Print the Window's description
        System.out.println(window.getDescription());
    }
}
