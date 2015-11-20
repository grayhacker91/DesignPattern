package CompositePattern.Graphic;

public class Program {
	public static void main(String args[]) {
		Circle c1, c2, c3, c4;
		c1 = new Circle();
		c2 = new Circle();
		c3 = new Circle();
		c4 = new Circle();

		CompositeGraphic g, g1, g2;
		g=new CompositeGraphic(); 
		g1=new CompositeGraphic();
		g2=new CompositeGraphic();

		g1.add(c1);
		g1.add(c2);
		g1.add(c3);

		g2.add(c4);

		g.add(g1);
		g.add(g2);
		g.print();
	}
}
