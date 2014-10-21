package es.upm.miw.pd.command.calculator;



public class ComandoSumar extends ComandoAbs  {
	private Calculadora receptor;
	private static final String NAME="SUMA";
	
	public ComandoSumar (Calculadora receptor) {
		super(NAME);
		this.receptor=receptor;
	}

	@Override
	public void ejecutar() {
		
	}


	
}
