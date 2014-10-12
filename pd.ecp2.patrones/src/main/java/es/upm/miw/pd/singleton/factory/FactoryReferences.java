package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;
    private int reference;
    private static FactoryReferences factory = null;

    private FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public static FactoryReferences getFactory(){
        if (factory == null) {
            factory = new FactoryReferences();
        }
        return factory;

    }

    public int getReference(final String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(final String key) {
        this.references.remove(key);
    }

}
