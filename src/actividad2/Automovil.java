package actividad2;

public class Automovil {

	// identificacion
	String marca;
	String modelo;
	String nombreDueno;

	// Estados
	boolean estaEncendido;
	boolean estaAbierto;
	boolean estaVacio = true;

	// Mediciones
	int kilometraje = 0;
	int nivelCombustible = 0;
	
	public void llenarTanque() {
		estaVacio = false;
		nivelCombustible = 100;
	}

	public void encender() {

		if (estaVacio || nivelCombustible == 0) {
			System.err.println("ERROR: no hay nafta");
		} else {
			System.out.println("Auto encendido");
			estaEncendido = true;
		}

	}

	public void avanzar() {

		if (estaEncendido && !estaVacio) {
			kilometraje += 10;
			nivelCombustible -= 20;
			System.out.println("Avanzaste " + kilometraje + "km");
		} else {
			System.err.println("No puede avanzar");
		}

	}

	public String obtenerDatos() {
		return "Automovil [Marca=" + marca + ", Modelo=" + modelo + ", nombreDueno=" + nombreDueno + ", estaEncendido="
				+ estaEncendido + ", estaAbierto=" + estaAbierto + ", estaVacio=" + estaVacio + ", kilometraje="
				+ kilometraje + ", nivelCombustible=" + nivelCombustible + "]";
	}
	
	public void mostrarDatos() {
		System.out.println( obtenerDatos() );
	}
	
	

	public void abrirPuertas() {
		
		if (estaEncendido == false) {
			System.out.println("Puertas abiertas");
			
		}else {
			System.out.println("Puertas cerradas");
		}
		
	}

}
