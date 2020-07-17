package dds.corrector.model.criterios;

import dds.corrector.model.Examen;

public interface ICriteriosStrategy {
	
	public Double calcular_nota(Examen examen);

}
