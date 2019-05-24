package modelo;

public class Revision {

	
	private String resultado;
	private String[] causas;
	
private String[] medicamentos;
	
	public Revision() {
		
super();
		// TODO Auto-generated constructor stub
	}
	
	
//Constructores con fields
	
public Revision(String resultado, String[] causas, String[] medicamentos) {
		
super();
		this.resultado = resultado;
		this.causas = causas;
		
this.medicamentos = medicamentos;
	}

	
public String getResultado() {
		// TODO Auto-generated method stub
		return resultado;
	}

	
public String mostrarCausas() {
		String causasm = "";
		
for (int i = 0; i < causas.length; i++) {
			causasm=causasm+" "+causas[i];
		}

		return causasm;
	}

	public String mostrarMedicamentos() {
		String medicamentos2="";

		for (int i = 0; i < medicamentos.length; i++) {
			medicamentos2=medicamentos2+" "+medicamentos[i];
		}
		return medicamentos2;
	}

}

	
	

	

