package es.upm.miw.pd.command.calculator.mementable;

import es.upm.miw.pd.command.calculator.ComandoAbs;
import upm.jbb.IO;

public class ComandoRestaurar extends ComandoAbs  {
    private CalculadoraMementable receptor;
    private static final String NAME="RESTAURAR";
    
    public ComandoRestaurar (CalculadoraMementable receptor) {
        super(NAME);
        this.receptor=receptor;
    }

    @Override
    public void ejecutar() {
        GestorMementos<MementoCalculadora> gestorMementos = receptor.getGestorMementos();
        IO.out.println("Introduzca nombre del punto de restauración");
        String key = (String) IO.in.select(gestorMementos.keys());
        receptor.deshacer(gestorMementos.getMemento(key));
    }

}