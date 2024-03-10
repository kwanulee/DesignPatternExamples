package adapter.ObjectAdapterExample;

public class VenderFactory {
		private static VenderFactory instance;
		
		private VenderFactory() {}
		
		public static VenderFactory getInstance() {
			if (instance == null) 
				instance = new VenderFactory();
			return instance;
		}
		
		public Vender createVender() {
			return new VenderAdapter( new Vender2());
		}

}
