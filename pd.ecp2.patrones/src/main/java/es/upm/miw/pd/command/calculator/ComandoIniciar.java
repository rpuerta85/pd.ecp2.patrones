package es.upm.miw.pd.command.calculator;


public class ComandoIniciar extends ComandoAbs {
    private Calculadora receptor;
    private static final String NAME="INICIAR";

    
    public ComandoIniciar (Calculadora receptor) {
        super(NAME);
        this.receptor=receptor;
    }
    
    @Override
    public void ejecutar() {
        receptor.iniciar();
    }

    
    
    
}
