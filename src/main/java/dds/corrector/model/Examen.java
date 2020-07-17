package dds.corrector.model;

import java.util.ArrayList;
import java.util.List;

import dds.corrector.model.preguntas.AbstractPregunta;

public class Examen {

	private Integer puntosDelExamen = 0;
	private Integer puntosDelEstudiante = 0;
	
	
	
	private ENotaMinimaAprobar notaMinima = ENotaMinimaAprobar.NOTA_CUATRO;
	
	private List<AbstractPregunta> listaDePreguntas = new ArrayList<>();
	
	
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
