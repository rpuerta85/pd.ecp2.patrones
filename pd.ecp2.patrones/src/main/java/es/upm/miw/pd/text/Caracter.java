package es.upm.miw.pd.text;

public class Caracter extends Componente {
    private char caracter;
    
    
    public Caracter(char caracter) {
        this.caracter = caracter;
    }
    
    @Override
    public String dibujar(boolean b) {
       return null;

    }

    @Override
    public void add(Componente h) {
     
    }
    

    public char getCaracter() {
        return caracter;
    }

    protected boolean isCompuesto(){
        return false;
    }
    
}
