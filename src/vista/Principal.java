package vista;

public class Principal {

	public static void main(String[] args) {
		Veterinaria veterinaria= new Veterinaria();
		
        veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		veterinaria.inscribirAnimal("mish", "gato", "Siames", 5, "fiebre");
        veterinaria.inscribirAnimal("lucas","perro","cocker",3,"Infeccion Renal");

		
		
		//Genero los medicos
		veterinaria.inscribirMedico("Jorge");	
		veterinaria.inscribirMedico("Diego");
		veterinaria.inscribirMedico("Sergio");
		veterinaria.inscribirMedico("Ines");
		veterinaria.inscribirMedico("Maria");
		veterinaria.inscribirMedico("Laura");
		
		//Diagnostico
		
		veterinaria.atenderAnimal(0,0, "Infeccion urinaria", new String[]{"Fallo hepatico"}, new String[]{"ninguno"});

		veterinaria.mostrarAnimalesAtendidosxMedico(0);
		
	}


}

	
	
	
	

