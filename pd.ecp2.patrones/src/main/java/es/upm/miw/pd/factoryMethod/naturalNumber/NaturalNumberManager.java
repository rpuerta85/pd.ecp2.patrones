package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumberCreator creator;
    
    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberEsCreator) {
        this.creator=naturalNumberEsCreator;
    }

    public NaturalNumberCreator getCreator() {
        return creator;
    }

    public NaturalNumber createNaturalNumber(int num) {
        return creator.createFigure(num);
    }

}
