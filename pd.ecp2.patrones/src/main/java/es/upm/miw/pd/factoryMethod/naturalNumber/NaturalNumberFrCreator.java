package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createFigure(int num) {
        return new NaturalNumberFr(num);
         }

}
