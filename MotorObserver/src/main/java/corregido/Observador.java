package corregido;

public class Observador implements IObservador {
	String nombre;

	public Observador(String n) {this.nombre= n;}

	public void update(String evento) {
		if(evento=="parar") System.out.println("El motor se ha parado");
		else if (evento=="arrancar")System.out.println("El motor ha arrancado");
		else if (evento=="bateria")System.out.println("SIN BATERIA, A EMPUJAR");
	}
}
