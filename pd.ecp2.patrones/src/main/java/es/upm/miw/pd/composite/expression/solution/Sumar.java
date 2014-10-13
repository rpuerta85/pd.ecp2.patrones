package es.upm.miw.pd.composite.expression.solution;

public class Sumar extends Operacion {

    private static final char OPERATOR = '+';

    public Sumar(final Expression exp1, final Expression exp2) {
        super(exp1, exp2, OPERATOR);
    }
    @Override
    protected final int operar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected final String toSring() {
        // TODO Auto-generated method stub
        return null;
    }

}
