package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {
    private int numero;

    public Numero(final int numero) {
        this.numero = numero;
    }

    @Override
    protected final int operar() {
        return numero;
    }

    @Override
    protected final String toSring() {
        return String.valueOf(numero);
    }

}
