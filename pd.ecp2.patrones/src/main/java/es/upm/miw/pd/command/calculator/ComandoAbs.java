package es.upm.miw.pd.command.calculator;

public abstract class ComandoAbs implements Comando {

	private String name;

	public ComandoAbs (String name) {
		this.name=name;
	}

	public abstract void ejecutar();
	
	
	public String name() {
		return name;
	}
	
	
}
