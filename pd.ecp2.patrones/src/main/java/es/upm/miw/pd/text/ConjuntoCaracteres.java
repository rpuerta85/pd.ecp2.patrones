package es.upm.miw.pd.text;

import java.util.List;

public abstract class ConjuntoCaracteres extends Componente {
    protected List<Componente> conjuntoCaracteres;

    @Override
    public String dibujar(boolean b) {
        String result = null;
        for (Componente componente : this.conjuntoCaracteres) {
            result += componente.dibujar(b);
        }
        return result;
    }

    @Override
    public void add(Componente h) {
        this.conjuntoCaracteres.add(h);
    }
    
    @Override
    protected boolean isCompuesto(){
        return true;
    }
}
