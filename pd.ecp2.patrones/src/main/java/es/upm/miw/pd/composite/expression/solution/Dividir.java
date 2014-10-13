package es.upm.miw.pd.composite.expression.solution;

public class Dividir extends Operacion {
    private static final char OPERATOR = '/';

    public Dividir(Expression exp1, Expression exp2) {
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
