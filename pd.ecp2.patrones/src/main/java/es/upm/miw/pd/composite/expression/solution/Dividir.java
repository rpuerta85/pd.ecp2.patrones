package es.upm.miw.pd.composite.expression.solution;

public class Dividir extends Operacion {
    private static final char OPERATOR = '/';

    public Dividir(Expresion exp1, Expresion exp2) {
        super(exp1, exp2, OPERATOR);
    }
    @Override
    protected final int operar() {
        return  expresion1.operar() / expresion2.operar();
    }
}
