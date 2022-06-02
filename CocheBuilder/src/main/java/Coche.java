public class Coche{
	public String marca;
	public String modelo;
	public int cm3;
	public String color;
	public int puertas;
	public String matricula;
	public boolean seguro;
	
	
	
	public Coche (CocheBuilder c) {
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.cm3 = c.cm3;
		this.color = c.color;
		this.puertas = c.puertas;
		this.matricula = c.matricula;
		this.seguro = c.seguro;
	}
	
	public static class CocheBuilder{
		public String marca;
		public String modelo;
		public int cm3;
		public String color;
		public int puertas;
		public String matricula;
		public boolean seguro;
		
		public Motor motor;
		
		public CocheBuilder(String matricula) {
			this.matricula = matricula;
		}
	


	
		




		public CocheBuilder ponerMarca(String m) {
			this.marca = m;
			
			return this;
		}
	
		public CocheBuilder ponerModelo(String m) {
			// TODO Auto-generated method stub
			this.modelo=m;
			
			return this;
		}
	
		public CocheBuilder ponerCilindrada(int c) {
			// TODO Auto-generated method stub
			this.cm3 = c;
			
			return this;
		}
	
		public CocheBuilder ponerColor(String c) {
			// TODO Auto-generated method stub
			this.color = c;
			
			return this;
		}
	
		public CocheBuilder ponerPuerta(int p) {
			// TODO Auto-generated method stub
			this.puertas = p;
			
			return this;
		}
	
		public CocheBuilder ponerMatricula(String m) {
			// TODO Auto-generated method stub
			this.matricula = m;
			return this;
		}
	
		public CocheBuilder ponerSeguro(boolean s) {
			// TODO Auto-generated method stub
			this.seguro = s;
			return this;
		}
	
		public CocheBuilder ponerMotor(Motor m) {
			// TODO Auto-generated method stub
			this.motor = m;
			return this;
		}
	
		public Coche build() {
			Coche coche = new Coche(this);
			return coche;
		}
	
	}
}
