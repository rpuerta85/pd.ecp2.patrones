package es.upm.miw.pd.text;

public class Parrafo extends ConjuntoCaracteres {

    @Override
    public void add(Componente h) {
        if(h.isCompuesto()) {
            throw new UnsupportedOperationException(MSG_EXCEPCION);
        }
        else {
            this.conjuntoCaracteres.add(h);
        }
    }
    public  void remove(Componente h) {
        this.conjuntoCaracteres.remove(h);
    }
    @Override
    protected String añadirCabeceraFinal() {
        String resul = null;
        if(!this.conjuntoCaracteres.isEmpty()) {
            resul = "\n";
        }
        return resul;
    }
}
