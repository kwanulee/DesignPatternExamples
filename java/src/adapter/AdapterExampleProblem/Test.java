package adapter.AdapterExampleProblem;

public class Test {
	public static void main(String[] args) {
		Vender vender = new Vender();		
        MyApp app = new MyApp(vender);		
        app.run();
	}
}
