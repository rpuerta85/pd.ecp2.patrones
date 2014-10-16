package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberEsCreatorTest {
    
    private NaturalNumberEsCreator naturalNumberEsCreator;
    
    @Before
    public void ini() {
        naturalNumberEsCreator = new NaturalNumberEsCreator();
    }

    @Test
    public void testCreateFigure () {
        assertNotNull(naturalNumberEsCreator.createFigure(1));
        assertEquals(naturalNumberEsCreator.createFigure(5).getValue(),
                new NaturalNumberEs(5).getValue());
    }


}
