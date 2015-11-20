package StrategyPattern.Duck;

public class Squack implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}