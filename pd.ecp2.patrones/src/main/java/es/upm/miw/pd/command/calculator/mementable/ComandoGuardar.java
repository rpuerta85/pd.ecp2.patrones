package es.upm.miw.pd.command.calculator.mementable;

import es.upm.miw.pd.command.calculator.ComandoAbs;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoAbs  {
    private CalculadoraMementable receptor;
    private static final String NAME="GUARDAR";
    
    public ComandoGuardar (CalculadoraMementable receptor) {
        super(NAME);
        this.receptor=receptor;
    }

    @Override
    public void ejecutar() {
        String nombreMemento = IO.in.readString("Introduzca nombre del punto de restauración");
        receptor.guardar(new MementoCalculadora(receptor.getTotal(), nombreMemento));
    }

}