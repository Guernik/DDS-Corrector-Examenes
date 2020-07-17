package dds.corrector.model.criterios;

import java.util.HashMap;
import java.util.Map;

import dds.corrector.model.Examen;

public class CriterioTablaConversion implements ICriteriosStrategy {

	
	private Map<String, Double> tablaConversion = new HashMap<>();


	public CriterioTablaConversion(Map<String,Double> tabla_conversion) {
		this.tablaConversion = tabla_conversion;
	}
	
	
	public Double calcular_nota(Examen examen) {
		return this.tablaConversion.get(examen.getPuntosEstudiante().toString());
	}

}
