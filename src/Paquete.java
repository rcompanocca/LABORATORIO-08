public class Paquete {
	private String nombre;
	private double costo;
	private int kilos;	
	public Paquete() {
		nombre = "";
		costo = 0;
		kilos = 0;
	}	
	public Paquete(String a, double b, int c) {
		nombre = a;
		costo = b;
		kilos = c;
	}
	public String getNombre() {
		return nombre;
	}
	public double getCosto() {
		return costo;
	}
	public int getKilos() {
		return kilos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public void setKilos(int kilos) {
		this.kilos = kilos;
	}
}
