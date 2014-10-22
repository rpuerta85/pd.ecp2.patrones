package es.upm.miw.pd.command.calculator.mementable;

public class CalculadoraMementableMock extends CalculadoraMementable {
    private String resultado;
    
    private MementoCalculadora mementoGuardado;
    private MementoCalculadora mementoRestaurado;
    
    public CalculadoraMementableMock(){
        super();
    }
    @Override
    public void imprimir() {
        resultado="Resulado: "+getTotal();
    }
    public String getResultado() {
        return resultado;
    }
    public void guardar(MementoCalculadora memento) {
        this.mementoGuardado=memento;
    }
    public void deshacer(MementoCalculadora memento) {
        this.mementoRestaurado = memento;
    }
    public MementoCalculadora getMementoGuardado() {
        return mementoGuardado;
    }
    public void setMementoGuardado(MementoCalculadora mementoGuardado) {
        this.mementoGuardado = mementoGuardado;
    }
    public MementoCalculadora getMementoRestaurado() {
        return mementoRestaurado;
    }
    public void setMementoRestaurado(MementoCalculadora mementoRestaurado) {
        this.mementoRestaurado = mementoRestaurado;
    }

}
