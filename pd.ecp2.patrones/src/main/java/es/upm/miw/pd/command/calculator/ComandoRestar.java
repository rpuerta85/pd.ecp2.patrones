package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbs  {
    private Calculadora receptor;
    private static final String NAME="RESTA";
    
    public ComandoRestar (Calculadora receptor) {
        super(NAME);
        this.receptor=receptor;
    }

    @Override
    public void ejecutar() {
        receptor.restar(IO.in.readInt(Constantes.MSG_IO_INNUMERO));
    }


    
}
