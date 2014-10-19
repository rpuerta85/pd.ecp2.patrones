package es.upm.miw.pd.text;

public class Parrafo extends ConjuntoCaracteres {

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
}
