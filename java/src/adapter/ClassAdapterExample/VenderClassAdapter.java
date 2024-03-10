package adapter.ClassAdapterExample;

public class VenderClassAdapter extends Vender2 implements Vender {
	
	public void request() {
		super.specificRequest();
	}

}
