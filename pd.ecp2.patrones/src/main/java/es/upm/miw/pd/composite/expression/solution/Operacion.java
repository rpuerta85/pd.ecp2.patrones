package es.upm.miw.pd.composite.expression.solution;

public abstract class Operacion extends Expresion {
    protected Expresion expresion1;
    protected Expresion expresion2;

    private char operador;

    public Operacion(final Expresion expresion1, final Expresion expresion2,
            final char operador) {
        this.expresion1=expresion1;
        this.expresion2=expresion2;
        this.operador = operador;
    }

    @Override
    protected abstract int operar();
    @Override
    protected final String toSring() {
        return "(" + expresion1.toSring() + operador + expresion2.toSring() + ")";
    }

}
