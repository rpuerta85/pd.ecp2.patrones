package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

    protected int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }
}
