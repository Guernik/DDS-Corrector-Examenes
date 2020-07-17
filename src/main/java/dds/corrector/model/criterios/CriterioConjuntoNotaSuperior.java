package dds.corrector.model.criterios;

import java.util.List;

import dds.corrector.model.Examen;

public class CriterioConjuntoNotaSuperior implements ICriteriosStrategy {
	
	
	private List<ICriteriosStrategy> listaCriterios;

	public CriterioConjuntoNotaSuperior(List<ICriteriosStrategy> lista_criterios) {
		this.listaCriterios = lista_criterios;
	}

	public Double calcular_nota(Examen examen) {
		
		return this.listaCriterios
			.stream()
			.mapToDouble(crit -> crit.calcular_nota(examen))
			.max()
			.orElseGet(() -> 0);

	}

}
