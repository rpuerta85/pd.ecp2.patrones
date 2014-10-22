package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class ConjuntoCaracteres extends Componente {
    protected List<Componente> conjuntoCaracteres = new  ArrayList<Componente>();
    protected static final String MSG_EXCEPCION = "Operación no soportada";

    @Override
    public String dibujar(boolean b) {
        String result = "";
        for (Componente componente : this.conjuntoCaracteres) {
            result += componente.dibujar(b);
        }
        result += añadirCabeceraFinal();
        return result;
    }

    protected abstract String añadirCabeceraFinal();
    
    @Override
    public abstract void add(Componente h);

    public abstract void remove(Componente h);
    
    
    @Override
    protected boolean isCompuesto(){
        return true;
    }
}
