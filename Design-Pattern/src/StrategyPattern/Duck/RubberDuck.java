package StrategyPattern.Duck;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squack();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
