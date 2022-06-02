
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor m = new Motor();
				
			Observador o1 = new Observador("Observador 1", "arrancar");
			Observador o2 = new Observador("Observador 2", "parar");
			Observador o3 = new Observador("Observador 3", "nada");
				
			m.suscribe(o1);
			m.suscribe(o2);
			m.suscribe(o3);
				
			m.eventGeneration();
				
		}
		
	}

