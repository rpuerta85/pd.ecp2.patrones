package es.upm.miw.pd.command.calculator.mementable;

public class MementoCalculadora {
    private int valor;

    private String nombre;

    public MementoCalculadora(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNombe() {
        return this.nombre;
    }

}
