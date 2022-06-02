package corregido;

public class Main {

	public static void main(String[] args) {
		Motor m = new Motor();
		
		Observador o1 = new Observador("Observador 1");
		Observador o2 = new Observador("Observador 2");
		Observador o3 = new Observador("Observador 3");
			
		m.suscribe(o1);
		m.suscribe(o2);
		m.suscribe(o3);
			
		m.eventGeneration();		
	}
}