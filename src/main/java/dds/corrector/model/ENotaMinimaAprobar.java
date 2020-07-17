package dds.corrector.model;

public enum ENotaMinimaAprobar {
	
	NOTA_SEIS(6),
	NOTA_CUATRO(4);

	private Integer notaMinima;

	ENotaMinimaAprobar(Integer i) {
		this.notaMinima = i;
 
	}

	public Integer getNotaMinima() {
		return notaMinima;
	}	
	

}
