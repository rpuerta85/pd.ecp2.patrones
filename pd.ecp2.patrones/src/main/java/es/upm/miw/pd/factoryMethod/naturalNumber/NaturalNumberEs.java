package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        this.setValue(value);
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEs.textValue[this.value];
        } else {
            return "???";
        }
    }

}
