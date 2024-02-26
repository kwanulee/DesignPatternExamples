package strategy.SimUDuckApp.Revision3;

public class RubberDuck extends Duck implements Quackable{

	public void display() {
		System.out.println("I'm a rubber duckie");

	}
	
	public void quack() {
		System.out.println("Squeak");
	}

}
