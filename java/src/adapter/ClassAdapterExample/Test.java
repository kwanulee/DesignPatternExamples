package adapter.ClassAdapterExample;

public class Test {

	public static void main(String[] args) {
		Vender vender = VenderFactory.getInstance().createVender();
		MyApp app = new MyApp(vender);
        app.run();
	}

}
