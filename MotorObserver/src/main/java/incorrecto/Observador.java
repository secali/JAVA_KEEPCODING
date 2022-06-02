public class Observador implements IMotor { //Debe implementar de la interfaz IObservador
	String interesado; //parar o arrancar
	String nombre;
	
	public String getInteresado() {
		return interesado;
	}
	
	
	
	public Observador(String nombre, String n) {
		this.nombre = nombre;
		this.interesado = n;
	}
	
	public void arrancar() { //notificación
		System.out.println("Evento notificado: arrancar");
	}

	public void parar() { // notificacion
		System.out.println("Evento notificado: parar");
		
	}

	public boolean estado(String tipoE) { //comprueba si el observador está interesado en el evento y elige notificacion
		if(tipoE == interesado && interesado =="arrancar") this.arrancar();
		else if (tipoE == interesado && interesado =="parar") this.parar();
		
		return true; 
	}

}
