package es.upm.miw.pd.command.calculator;

import java.util.HashMap;
import java.util.Map;


public class GestorComandos {
    private Map<String, ComandoAbs> comandos = new HashMap<>();

    public void add(ComandoAbs comando) {
        this.comandos.put(comando.name(), comando);
    }

    public void execute(String key) {
        this.comandos.get(key).ejecutar();
    }

    public String[] keys() {
        return this.comandos.keySet().toArray(new String[0]);
    }
}
