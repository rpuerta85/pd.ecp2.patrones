package es.upm.miw.pd.factoryMethod.naturalNumber;

public class Main {
    
    public static void main(String args[]){
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        NaturalNumber naturalNumber=naturalNumberManager.createNaturalNumber(3);
        System.out.println(naturalNumber.getTextValue());
        
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        naturalNumber=naturalNumberManager.createNaturalNumber(3);
        System.out.println(naturalNumber.getTextValue());

        
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        naturalNumber=naturalNumberManager.createNaturalNumber(3);
        System.out.println(naturalNumber.getTextValue());

        
        
        
    }
}
