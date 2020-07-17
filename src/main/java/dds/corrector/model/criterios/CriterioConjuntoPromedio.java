package dds.corrector.model.criterios;

import java.util.List;

import dds.corrector.model.Examen;

public class CriterioConjuntoPromedio implements ICriteriosStrategy{

	private List<ICriteriosStrategy> listaCriterios;

	public CriterioConjuntoPromedio(List<ICriteriosStrategy> lista_criterios) {
		this.listaCriterios = lista_criterios;
	}

	public Double calcular_nota(Examen examen) {
		
		return this.listaCriterios
			.stream()
			.mapToDouble(crit -> crit.calcular_nota(examen))
			.average()
			.orElseGet( () -> 0d);

	}

}
