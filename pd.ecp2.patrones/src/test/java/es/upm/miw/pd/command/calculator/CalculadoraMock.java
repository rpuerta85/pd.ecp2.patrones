package es.upm.miw.pd.command.calculator;

public class CalculadoraMock extends Calculadora {
    private String resultado;
    
    public CalculadoraMock(){
        super();
    }
    @Override
    public void imprimir() {
        resultado="Resulado: "+getTotal();
    }
    public String getResultado() {
        return resultado;
    }


}
