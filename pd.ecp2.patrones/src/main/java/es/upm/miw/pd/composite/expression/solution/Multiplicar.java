package es.upm.miw.pd.composite.expression.solution;

public class Multiplicar extends Operacion {

    private static final char OPERATOR = '*';

    public Multiplicar(Expresion exp1, Expresion exp2) {
        super(exp1, exp2, OPERATOR);
    }
    @Override
    protected final int operar() {
        return  expresion1.operar() * expresion2.operar();
    }

}
