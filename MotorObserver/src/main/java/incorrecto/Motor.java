import java.util.ArrayList;
import java.util.List;

public class Motor { //Debe implementar de la interfaz IMotor
	List<IMotor> observers = new ArrayList<IMotor>();
	
	//faltada estado del motor.... y los metodos arrancar y parar cambia su estado...
	
	public void suscribe(IMotor observer) {
		observers.add(observer);
	}
	
	public void unSuscribe(IMotor observer) {
		observers.remove(observer);
	}
	
	public void notify(String event) { //llamar al update del observador...
		for(IMotor o: observers) {
			o.estado(event);
		}
	}
	
	public void eventGeneration() {
		for(int i=0; i<5; i++) {
			int random = (int) (Math.random()*2+1);  //genera numeros aleatorios entre 1 y 2
			
			if (random == 1) notify("parar");
			else if(random ==2) notify("arrancar");
			else throw new RuntimeException("WTF!");
		}
	}
}
