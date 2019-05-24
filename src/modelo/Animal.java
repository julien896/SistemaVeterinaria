package modelo;

public class Animal {

	
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String causaDeAtencion;
	private Revision revision;
	
	
public Animal(String nombre, String tipo, String raza, int edad,
			String causaDeAtencion) 
{
		super();
		
this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
		
this.causaDeAtencion = causaDeAtencion;
		
	}

	
	
	
public Revision getRevision() {
		return revision;
	}
	
	
public void setRevision(Revision revision) {
		this.revision = revision;
	}



	
public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}



	
public String mostrarRevision() {
		
		
return "El resultado es: " +revision.getResultado()+ "\nLas causas son: " +revision.mostrarCausas() + 
"\nLos medicamentos que debe tomar son:" +revision.mostrarMedicamentos();
				
	}
	
}

	
	

