package es.upm.miw.pd.command.calculator.mementable;

import es.upm.miw.pd.command.calculator.Calculadora;

public class CalculadoraMementable extends Calculadora {
    private GestorMementos<MementoCalculadora> gestorMementos = new GestorMementos<MementoCalculadora>();
    private String nombreMemento;
    
    public void guardar(MementoCalculadora memento) {
        gestorMementos.addMemento(memento);
    }
    public void deshacer(MementoCalculadora memento) {
        this.total = memento.getValor();
        this.nombreMemento = memento.getNombe();
        this.imprimir();
    }
    public GestorMementos<MementoCalculadora> getGestorMementos() {
        return gestorMementos;
    }
    
    
}
