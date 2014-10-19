package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<Character,Componente> caracteres;
    private static FactoriaCaracter factoriaCaracteres=null;
    
    private FactoriaCaracter() {
        caracteres = new HashMap<Character, Componente>();
    }
   
    public static FactoriaCaracter getFactoria() {
        if (factoriaCaracteres == null) {
            factoriaCaracteres = new FactoriaCaracter();
        }
        return factoriaCaracteres;
    }

    public Componente get(char caracter) {
        Componente result = caracteres.get(caracter);
        if(result == null) {
            Caracter c = new Caracter(caracter);
            caracteres.put(caracter, c);
            result = c;
        } 
        return result;
    }

    public void removeCaracter(char caracter) {
        caracteres.remove(caracter);
    }

}
