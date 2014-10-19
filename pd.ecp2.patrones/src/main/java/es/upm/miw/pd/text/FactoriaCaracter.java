package es.upm.miw.pd.text;

import java.util.Map;

public class FactoriaCaracter {
    private Map<Character,Componente> factoriaCaracter;
    private int numElementos;
    private static FactoriaCaracter factoriaCaracteres;
    
    private FactoriaCaracter() {
        
    }
   
    public static FactoriaCaracter getFactoria() {
        // TODO Auto-generated method stub
        return factoriaCaracteres;
    }

    public Componente get(char c) {
       
        return null;
    }

    public void removeCaracter(char c) {
        // TODO Auto-generated method stub
        
    }

    
    
    
}
