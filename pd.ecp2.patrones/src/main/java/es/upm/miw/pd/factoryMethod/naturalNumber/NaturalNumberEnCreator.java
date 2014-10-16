package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createFigure(int num) {
        return new NaturalNumberEn(num);
        
    }

}
