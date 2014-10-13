package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacion extends Expression {
    protected List<Expression> expresiones = new ArrayList<Expression>();
    private char operador;

    public Operacion(final Expression exp1, final Expression exp2,
            final char operador) {
        expresiones.add(exp1);
        expresiones.add(exp2);
        this.operador = operador;
    }

    @Override
    protected abstract int operar();

    @Override
    protected abstract String toSring();



}
