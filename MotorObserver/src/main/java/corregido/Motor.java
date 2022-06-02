package corregido;
import java.util.ArrayList;
import java.util.List;

public class Motor implements IMotor{ //Debe implementar de la interfaz IMotor
	List<IObservador> observers = new ArrayList<IObservador>(); 
	
	/*
	 * Preguntar como se haría para añadir observadores con diferentes "intereses"
	 * 
	 */
	
	boolean estado;
	
	public Motor () {estado = false;}

	
	public void suscribe(IObservador observer) {observers.add(observer);}
	
	public void unSuscribe(IObservador observer) {observers.remove(observer);}
	
	
	public void notify(String event) { //llamar al update del observador...
		for(IObservador o: observers) o.update(event);
	}
	
	public void eventGeneration() {
		for(int i=0; i<10; i++) {
			int random = (int) (Math.random()*3+1);  //genera numeros aleatorios entre 1 y 2
			System.out.println("Valor aleatorio: "+random);
			
			if (random == 1) {
				notify("parar");
				this.parar();
			}
			else if(random ==2) {
				notify("arrancar");
				this.arrancar();
			}
			else notify("bateria");
		}
	}
	public void arrancar() {estado = true;}
	public void parar() {estado  = false;}
	public boolean estado() {return this.estado;}
}
