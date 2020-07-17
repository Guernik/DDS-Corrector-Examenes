package dds.corrector.model;

public class Examen {

	private Integer puntosDelExamen = 0;
	private Integer puntosDelEstudiante = 0;
	
	
	
	private ENotaMinimaAprobar notaMinima = ENotaMinimaAprobar.NOTA_CUATRO;
	
	
	public Examen() {
	
	}
	
	
	
	public Integer getPuntosEstudiante() {
	
		return this.puntosDelEstudiante;
	}
	
	public Integer getPuntosExamen() {
		return this.puntosDelExamen;
	}
	
	
	public Double calcularNotaFinal() {
		return null;
	}

}
