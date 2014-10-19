package es.upm.miw.pd.text;

import java.util.List;

public abstract class ConjuntoCaracteres extends Componente {
    protected List<Componente> conjuntoCaracteres;
    protected static final String MSG_EXCEPCION = "Operación no soportada";

    @Override
    public String dibujar(boolean b) {
        String result = null;
        
        for (Componente componente : this.conjuntoCaracteres) {
            result += componente.dibujar(b);
        }
        if(!this.conjuntoCaracteres.isEmpty()) {
            result += "\n";
        }
        
        return result;
    }

    @Override
    public abstract void add(Componente h);

    public abstract void remove(Componente h);
    
    @Override
    protected boolean isCompuesto(){
        return true;
    }
}
