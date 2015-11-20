package StrategyPattern.Duck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		System.out.println("=========simulation1=========");
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println("=========simulation2=========");
		
		Duck mallard2 = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model2 = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}