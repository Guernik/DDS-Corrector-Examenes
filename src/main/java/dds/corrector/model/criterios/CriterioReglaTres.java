package dds.corrector.model.criterios;

import dds.corrector.model.Examen;

public class CriterioReglaTres implements ICriteriosStrategy {


	public CriterioReglaTres() {
	
	}
	
	
	public Double calcular_nota(Examen examen) {	
		
		Double puntosExamen = Double.valueOf(examen.getPuntosExamen());
		Double puntoEstudiante = Double.valueOf(examen.getPuntosEstudiante());
		
		
		return ( ( puntoEstudiante * 10d) / puntosExamen );
	}

}
