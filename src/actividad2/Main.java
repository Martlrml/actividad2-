package actividad2;

public class Main {

	public static void main(String[] args) {

		Automovil auto1 = new Automovil();

		auto1.marca = "Ford";
		auto1.modelo = "20";
		auto1.nombreDueno = "Leo";
		
		auto1.mostrarDatos();
		auto1.llenarTanque();
		auto1.encender();
		auto1.avanzar();
		
		
		Automovil auto2 = new Automovil();

		System.out.println("---------------------------------------------------");
		auto2.marca = "Ferrari";
		auto2.modelo = "30";
		auto2.nombreDueno = "Martin";
		
		auto2.mostrarDatos();
		auto2.encender();
		auto2.avanzar();

	}

}
