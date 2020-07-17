package dds.corrector.model.criterios;

import dds.corrector.model.Examen;

public class CriterioRestarNPuntos implements ICriteriosStrategy{
	
	
	private Double cantPuntosARestar = 0d;

	public CriterioRestarNPuntos(Double cant_puntos_a_restar) {
		this.cantPuntosARestar = cant_puntos_a_restar;	
	}
	
	

	public Double calcular_nota(Examen examen) {
		return examen.getPuntosEstudiante() - cantPuntosARestar;
	}

}
