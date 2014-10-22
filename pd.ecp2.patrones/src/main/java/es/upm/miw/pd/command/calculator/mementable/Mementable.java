package es.upm.miw.pd.command.calculator.mementable;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
