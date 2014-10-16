package es.upm.miw.pd.factoryMethod.naturalNumber;

public class Main {
    
    public void crearNaturalNumberEspañol() {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        NaturalNumber naturalNumber=naturalNumberManager.createNaturalNumber(3);
        System.out.println(naturalNumber.getTextValue());
    }
    
    public static void main(String args[]){
        Main main=new Main();
        main.crearNaturalNumberEspañol();
        
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        NaturalNumber naturalNumber=naturalNumberManager.createNaturalNumber(4);
        
        
        
    }
}
