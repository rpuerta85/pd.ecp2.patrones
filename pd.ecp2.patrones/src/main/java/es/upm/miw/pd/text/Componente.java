package es.upm.miw.pd.text;

public abstract class Componente {

    public abstract String dibujar(boolean b);

    public abstract void add(Componente h);
    
    protected abstract boolean isCompuesto();

}
