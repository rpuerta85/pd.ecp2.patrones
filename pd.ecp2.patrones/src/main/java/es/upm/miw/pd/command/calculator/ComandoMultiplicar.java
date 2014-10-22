package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoMultiplicar extends ComandoAbs  {
    private Calculadora receptor;
    private static final String NAME="MULTIPLICACION";
    
    public ComandoMultiplicar (Calculadora receptor) {
        super(NAME);
        this.receptor=receptor;
    }

    @Override
    public void ejecutar() {
        receptor.multiplicar(IO.in.readInt(Constantes.MSG_IO_INNUMERO));
    }


    
}
