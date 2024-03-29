package strategy.SimUDuckApp.Revision3;

import java.util.ArrayList;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		
		ducks.add(new MallardDuck());
		ducks.add(new RedheadDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());
		
		for (Duck d: ducks) {
			d.display();
			d.swim();
			if (d instanceof Quackable)
				((Quackable)d).quack();
			if (d instanceof Flyable)
				((Flyable)d).fly();
			System.out.println();
		}

	}

}
