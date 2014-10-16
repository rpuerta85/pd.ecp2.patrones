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
        assertNotNull(naturalNumberEsCreator.createFigure());
        assertEquals(naturalNumberEsCreator.createFigure().getClass().getSimpleName(),
                new NaturalNumberEs(1).getClass().getSimpleName());
    }


}
