package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberFrCreatorTest {
    
    private NaturalNumberFrCreator naturalNumberFrCreator;
    
    @Before
    public void ini() {
        naturalNumberFrCreator = new NaturalNumberFrCreator();
    }
    @Test
    public void testCreateFigure () {
        assertNotNull(naturalNumberFrCreator.createFigure(1));
        assertEquals(naturalNumberFrCreator.createFigure(5).getValue(),
                new NaturalNumberEs(5).getValue());
    }


}
