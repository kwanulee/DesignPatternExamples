package strategy.SimUDuckApp.Revision4;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}

}
