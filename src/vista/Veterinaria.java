package vista;

import modelo.Animal;
import modelo.Doctor;

public class Veterinaria {

	private Animal[] listaAnimales= new Animal[20];
	
	private int animalesInscriptos=0;
		
	private Doctor[] listaMedicos= new Doctor[5];
		
	private int cantidadMedicos=0;
		
		
		
		
	public void inscribirAnimal(String nombre, String tipo, String raza, int edad,String causa){
			if(animalesInscriptos<20){
				this.listaAnimales[this.animalesInscriptos]= new Animal(nombre,tipo,raza,edad,causa);
				this.animalesInscriptos++;
			}else System.out.println("No puede inscribir mas animales");
		}
		
		public void inscribirMedico(String nombre){
			if(cantidadMedicos<5){
				this.listaMedicos[this.cantidadMedicos]= new Doctor(nombre);
				this.cantidadMedicos++;
			}else System.out.println("No puede inscribir mas medicos");
		}
		
		public void atenderAnimal(int numeroMedico,int numeroAnimal,String resultado, String[] causas, String[] medicamentos) {
			
			
			
			
		listaMedicos[numeroMedico].atenderAnimal(listaAnimales[numeroAnimal], resultado,causas,medicamentos);
		
		
		}
		
		public void mostrarAnimalesAtendidosxMedico(int numeroMedico){
			System.out.println("El medico atendio: " +listaMedicos[numeroMedico].getAnimalesAtendidos());
		}
		
		//JULIAN
	}

	
	
	
	
	

