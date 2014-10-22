package es.upm.miw.pd.text;

public class Texto extends ConjuntoCaracteres {

    @Override
    public void add(Componente h) {
        if(h.isCompuesto()) {
            this.conjuntoCaracteres.add(h);
        }
        else {
            throw new UnsupportedOperationException(MSG_EXCEPCION);
        }
    }
    public  void remove(Componente h) {
        if(h.isCompuesto()) {
            this.conjuntoCaracteres.remove(h);
        }
     }
   
    @Override
    protected String añadirCabeceraFinal() {
        String result = null;
        if(!this.conjuntoCaracteres.isEmpty()) {
            result = "---o---"+"\n";
        }
        return result;
    }
}
