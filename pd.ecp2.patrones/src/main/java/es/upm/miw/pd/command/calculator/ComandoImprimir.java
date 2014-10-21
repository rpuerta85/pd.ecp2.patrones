package es.upm.miw.pd.command.calculator;


public class ComandoImprimir extends ComandoAbs {
	private Calculadora receptor;
	private static final String NAME="IMPRIMIR";

	
	public ComandoImprimir (Calculadora receptor) {
		super(NAME);
		this.receptor=receptor;
	}
	
	@Override
	public void ejecutar() {
	}

	
	
	
}
