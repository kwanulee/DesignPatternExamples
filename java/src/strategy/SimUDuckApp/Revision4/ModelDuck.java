package strategy.SimUDuckApp.Revision4;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}
	
	public void display() {
		System.out.println("I'm a model duck ");

	}

}
