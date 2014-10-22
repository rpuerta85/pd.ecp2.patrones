package es.upm.miw.pd.command.calculator.mementable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos<T> {
    private SortedMap<String, T> lista = new TreeMap<String, T>();

    public void addMemento(T memento) {
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.lista.put(this.lista.size() + ":" +((MementoCalculadora)memento).getNombe() +" "+df.format(d), memento);    
        }

    public T getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }

}
