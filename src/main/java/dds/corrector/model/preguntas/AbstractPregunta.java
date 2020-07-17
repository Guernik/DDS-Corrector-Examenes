package dds.corrector.model.preguntas;

public abstract class AbstractPregunta {
	
	
	private Integer pesoPregunta = 0;
	
	abstract Boolean contestoCorrectamente();

	public Integer getPesoPregunta() {
		return pesoPregunta;
	}

	public void setPesoPregunta(Integer pesoPregunta) {
		this.pesoPregunta = pesoPregunta;
	}

}
