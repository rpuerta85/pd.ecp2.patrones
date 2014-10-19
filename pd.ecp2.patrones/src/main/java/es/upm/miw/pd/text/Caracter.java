package es.upm.miw.pd.text;

public class Caracter extends Componente {
    private char caracter;
    
    
    public Caracter(char caracter) {
        this.caracter = caracter;
    }
    
    @Override
    public String dibujar(boolean mayuscula) {
       String result = String.valueOf(caracter); 
        if(mayuscula) {
            result = result.toUpperCase();
       }else {
           result = result.toLowerCase();
       }
        return result;

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
