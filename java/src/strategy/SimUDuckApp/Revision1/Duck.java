package strategy.SimUDuckApp.Revision1;

public abstract class Duck {

	public void quack() {
		System.out.println("Quack");
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	abstract public void display();
	public void fly() {
		System.out.println("I'm flying");
	}
}
