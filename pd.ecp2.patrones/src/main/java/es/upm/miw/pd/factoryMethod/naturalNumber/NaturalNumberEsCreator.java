package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createFigure(int num) {
        return new NaturalNumberEs(num);
        
    }

}
